import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DataFlow {
    //GESTION DES FICHIERS - FLUX DE DONNEES

    public static void main(String[] args) {
        //source à la RACINE du projet
        Path source = Paths.get("test.txt");
        Path writtenFile = Paths.get("test3.txt");


        //Création
        try {
            Files.createFile(source);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(
                "Existe ? " + Files.exists(source)
        );

        //Système de fichier
        System.out.println(source.getFileSystem());
        //Nom du fichier
        System.out.println(source.getFileName());
        //Chemin absolu
        System.out.println(source.toAbsolutePath());

        Path target = Paths.get("test2.txt");

        //TRY CATCH OBLIGATOIRE pour l'écriture d'un nouveau fichier
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            //MOVE FILES
            //se comporte comme mv sous linux
            //Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);

            //Ecriture directement à la suite (Récent : Java11)
            //Ecrit en UTF8
            Files.writeString(target, "BLAH!");

            //Affichage du contenu du fichier (équivalent "cat") (JAVA 11)
            System.out.println(Files.readString(target));

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Suppression
        try {
            Files.delete(source);
            Files.delete(target);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Lecture dans un fichier :
        String string;
        try {

            BufferedReader reader = Files.newBufferedReader(writtenFile);
            //Boucle sur chaque ligne du fichier
            System.out.println(reader.toString());
            while ((string = reader.readLine()) != null) {
                System.out.println(string);
            }

            //Fonctionne comme un Iterator pour les listes, doit être réinitialisé à chaque parcours
            //Il est posssible de rajouter une limite via un compteur i pour s'arrêter à la ligne convenue
            reader = Files.newBufferedReader(writtenFile);
            int i = 0;
            while ((string = reader.readLine()) != null && i < 2) {
                System.out.println(string);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Ecriture dans un fichier avec le BufferedWriter
        try {
            BufferedWriter writer = Files.newBufferedWriter(writtenFile);
            writer.write("Nouvelle phrase");
            writer.append("[APPEND]");
            writer.write("Nouvelle phrase");
            writer.newLine();
            writer.write("Nouvelle phrase dans une nouvelle ligne");
            //Fermeture du fichier, impératif pour la sauvegarde du fichier, sinon il le garde ouvert
            writer.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //Ecriture à la suite du fichier sans l'effacer
        try {
            FileWriter fileWriter = new FileWriter("test3.txt", true);
            //Ecrire dans le fichier à partir du contenu actuel du filewriter
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.newLine();
            writer.write("FileWriter est passé par ici");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Sauvegarde de l'état d'un objet dans un fichier
        String sbeuh = new String();
        try {
            FileOutputStream fos = new FileOutputStream("save");
            ObjectOutputStream oos = new ObjectOutputStream(fos);


            oos.writeObject(sbeuh);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lire la sauvegarde
        try {
            FileInputStream fis = new FileInputStream("save");
            ObjectInputStream ois = new ObjectInputStream(fis);

            sbeuh = (String) ois.readObject();

            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
