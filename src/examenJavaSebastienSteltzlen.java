import java.util.ArrayList;

/*        On a un tableau avec les nombres de la grille (10 nombres) du joueur (un seul joueur)
        On un tableau avec entré des tirages (15 nombres) et on regarde si le joueur à gagné ou pas*/

public class examenJavaSebastienSteltzlen {

    //OPT : Objet list servant à l'affichage les numéros trouvés
    final private static ArrayList<Integer> resultatsConcordants = new ArrayList<>();

    public static void main(String[] args) {


        //Le numéros cochés sur la grille
        int[] maGrille = new int[10];
        //Le tirage
        int[] tiragesLoto = new int[15];
        //Deux compteurs à boucles
        int i;
        int j;
        //Numéro à incrémenter qui servira de comparateur
        int k = 0;

        //Deux boucles servant à alimenter le tableau
        for (i = 0; i < maGrille.length; i++) {
            //DEBUG
            //maGrille[i] = i;
            maGrille[i] = (int) (Math.random() * 100);
        }

        for (i = 0; i < tiragesLoto.length; i++) {
            //DEBUG
            //tiragesLoto[i] = i;
            tiragesLoto[i] = (int) (Math.random() * 100);
        }

        //Parcours de ma grille
        for (i = 0; i < maGrille.length; i++) {
            //Pour chaque occurence de ma grille, je parcours le tableau des résultats
            for (j = 0; j < tiragesLoto.length; j++) {
                //Si le chiffre de ma grille correspond au chiffre que je parcours
                if (maGrille[i] == tiragesLoto[j]) {
                    //alors k s'incrémente à mesure que les résultats correspondent
                    k++;
                    //OPT : on enregistre la liste des numéros correspondants dans un tableau
                    resultatsConcordants.add(tiragesLoto[j]);
                }
            }
        }

        /* Affichange des résultats :

        Si k est différent de la longuer de ma grille, cela signifie que j'ai perdu*/
        if (k != maGrille.length) {
            System.out.println("Vous avez perdu !");
        } else {
            System.out.println("Vous avez gagné !!");
        }
        //Gestion des pluriels
        switch (k) {
            case 0 -> System.out.println("Vous n'avez aucun bon numero");
            case 1 -> System.out.println("Vous n'avez trouvé qu'un seul bon numéro. Le voici : " + resultatsConcordants.get(0));
            default -> {
                System.out.println("Vous n'aviez que " + k + " bons numéros. Voici les numéros que vous aviez trouvés");
                for (i = 0; i < resultatsConcordants.size(); i++) {
                    System.out.print(resultatsConcordants.get(i) + " ");
                }
            }
        }

    }
}
