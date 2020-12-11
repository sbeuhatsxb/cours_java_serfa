import java.text.DecimalFormat;
import java.util.Random;



public class CalculMoyenneEleves {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

/*      EXERCICE
        Entrer les notes (float) des élèves d'une classe de 5 élèves puis
        calculer et afficher la moyenne.

        Faire un deuxième tableau avec les noms des élèves en coordonnant les
        index des noms et des notes. Afficher "nom : note".

        Transformer ça en tableau 2D pour pouvoir mettre 3 notes par élèves.

        Refaire un affichage "nom : toutes les notes"*/

        float min = 0;
        float max = 20;
        Random r = new Random();
        float[][] elevesNotes = new float[5][3];
        float sommeDesNotes = 0;
        float totalDesNotes = 0;
        float moyenneClasse;
        float moyenneEleve;
        int i;
        int j;

        String[] eleves = new String[]{"Fréderic", "Redouane", "Magomed", "Khawla", "Cevdet"};

        int p = 1;
        for (String nomEleve : eleves) {
            System.out.println("Le nom de l'élève est : " + nomEleve);
            System.out.println("Je suis passé dans mon tableau : " + p + " fois");
            p++;
        }

        for (i = 0; i<eleves.length; i++){
            float sommeEleve = 0;
            System.out.print(eleves[i] + " :");
            for(j = 0; j< elevesNotes[i].length; j++){
                float random = min + r.nextFloat() * (max - min);
                elevesNotes[i][j] = random;
                if(j != elevesNotes[i].length - 1){
                    System.out.print(" " + df.format(elevesNotes[i][j]) + " |");
                } else {
                    System.out.print(" " + df.format(elevesNotes[i][j]));
                }
                sommeDesNotes += random;
                totalDesNotes++;
                sommeEleve += random;
            }
            moyenneEleve = sommeEleve / 3;
            System.out.println("\nLa moyenne de " + eleves[i] + " est de : " + df.format(moyenneEleve));
        }

        moyenneClasse = sommeDesNotes / totalDesNotes;

        System.out.println("\nLa moyenne de la classe est de " + df.format(moyenneClasse));

        i = 0;
        //USAGE DE FOREACH DANS UN TABLE MULTIDIMENSIONNEL
        for (float[] indexEleve : elevesNotes) {
            j = 1;
            for (float note : indexEleve){
                System.out.println("Pour le contrôle numéro " + j + " l'élève " + eleves[i] + " a eu " + df.format(note));
                j++;
            }

            i++;

        }

        //Afficher notes élèves par contrôle
        for (i = 0; i<elevesNotes[i].length; i++){
            System.out.println("Contrôle " + (i+1));
            for (j = 0;j<eleves.length; j++ ){
                System.out.println(eleves[j] + " : " + elevesNotes[j][i]);
            }
            System.out.println();
        }

    }
}
