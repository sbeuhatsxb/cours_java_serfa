import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {

        //déclaration de tableaux

        int[] myTab;
        myTab = new int[7]; //index de zero à six initialisé avec des zeros partout
        for(int i = 0; i<myTab.length; i++){
            System.out.println(myTab[i]);
        }
        int[] myOtherTab = new int[7]; //autre possibilité de déclarer un tableau
        System.out.println();


        myTab[5] = 8; //un 8 dans la sixième case du tableau

        for(int i = 0; i<myTab.length; i++){
            System.out.println(myTab[i]);
        }
        System.out.println();

        //nourrir le tableau à l'aide d'une boucle
        for(int i = 0; i<myTab.length; i++){
            myTab[i] = i;
        }

        //Autre possiiblité :
        int[] myOtherTab2 = new int[]{1,2,3,4,5,6,7,8};
        for(int i = 0; i<myOtherTab2.length; i++){
            System.out.println(myOtherTab2[i]);
        }
        System.out.println();

        //Autre possibilité de parcourir un tableau :
        for(int value : myOtherTab2)
            System.out.println(value);

        System.out.println();System.out.println();System.out.println();
        //IL EST IMPOSIBLE DE REDIMENSIONNER UN TABLEAU, IL FAUT LE SUPPRIMER ET LE RECREER

        //FOREACH
        for (int iteration : myOtherTab) {
            System.out.println("foreach" + myOtherTab2[iteration]);
        }
        
        
        //Exercice :
        /*  Entrer dans un tableau de boolean les résultats d'un tirage à pile ou
        face (7 lancés).

        Afficher combien il y a eu de face et combien il y a eu de pile*/

        boolean[] tirageTab = new boolean[2];
        Scanner scan = new Scanner(System.in);
        String result;
        int j = 0;

        for(int i = 0; i<tirageTab.length;i++){
            System.out.println("Pile ou face ?");
            result = scan.nextLine();
            if (result.equalsIgnoreCase("pile")){
                tirageTab[i] = true;
                j++;
            } else if (result.equalsIgnoreCase("face")) {
                tirageTab[i] = false;
            } else {
                System.out.println("La saisie est incorrecte : veuillez écrire 'pile' ou 'face' siouplé, soyez sympa c'est un jeu quoi");
                i--;
            }
        }

        int diff = tirageTab.length-j;

        System.out.println("\nIl y a eu "+j+" tirages à pile et "+ diff +" tirages à face. \nC'était super hein ? On rejoue ?");

    }
}
