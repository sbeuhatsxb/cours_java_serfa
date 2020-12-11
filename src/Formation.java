import java.math.BigDecimal;
import java.util.Scanner;

public class Formation {
    public static void main(String[] args) {

        System.out.println("Autre \"texte\"");

        int nb1;
        nb1 = 10;

        int nb2 = 20;

        System.out.println(nb1+""+nb2);

        byte byteNb = 100;
        short shortNb = 32000;
        int intNb = 2000000000;
        //Important, rajouter L pour les nombres longs (spec java)
        long longNb = 9223372036854775807L;
        //Idem, rajouter f pour les floats longs (spec java)
        float floatNb = 3.1415926553f;
        //Idem, rajouter d pour les doubles longs (spec java)
        double doubleNb = 0.3333333333333333333333333333333333333333333333d;

        //Caractères
        //Déclaration d'un char avec simple quote '
        char character = 'a';
        //Déclaration d'une chaine avec les guillemets
        String chaine = "'Bonj`our'";
        System.out.println(chaine);

        //Booléen
        boolean acces = true;

        //Déclaration groupée : (le type ne se spécifie qu'une fois, séparé par des virgules - pas de différence niveau perf)
        int nb3 = 30, nb4 = 40, nb5 = 50;

        //Statiques ou constantes (protection de la variable, elle prend aussi moins de place)
        //Supprime les setters de la variable (non nécessaires en tant que constante)
        final float gravity = 9.81f;

        //Concaténation
        System.out.println("La gravité terrestre a une valeur de " + gravity);

        //Addition, soustraction, multiplication, division, affectation
        nb1 = nb2 + nb3;
        nb1 = nb2 - nb3;
        nb1 = nb2 * nb3;
        nb1 = nb2 / nb3;
        nb1 = nb2;

        //Opérateurs minifiés
        nb1 = nb1 + 1;
        // ---->
        nb1++;

        nb1 = nb1 - 40;
        //--->
        nb1 -= 40;

        nb1--;
        nb1 *= 60;
        nb1 /= 300;

        //Déclaration d'inputs
        Scanner scan = new Scanner(System.in);
        String prenom;
        String nom;
        int age;
        int mort;

        System.out.println("Quel est votre prénom ?");
        prenom = scan.nextLine();

        if(prenom.equals("sbeuh")){
            age = 20;
        }


        System.out.println("Quel est votre nom ?");
        nom = scan.nextLine();

        System.out.println("Quel est votre âge ?");
        age = scan.nextInt();

        if(age == 20){
            age = 10;
        } else {

        }

        System.out.println("A quel âge pensez-vous mourir ?");
        mort = scan.nextInt();

        //Cast ou conversion de types
        float percentLife = (age / (float)mort) * 100;
        String percentLifeDisplayed = String.format("%.02f", percentLife);

        //Cast
        float floatCast = 3.1415926553f;
        int i1 = (int) floatCast;
        System.out.println(i1);

        System.out.println("Vous vous appelez : " + prenom + " " + nom + " et vous avez effectué " + percentLifeDisplayed + "% de votre vie.");


        //Note sur les floats
        //Les flot ont une précision très approximative, les floats en mémoire sont stockés
        // Par exemple, 3.2 peut être stocké à 3.2000004 par exemple
        float f1 = 3.2f;
        float f2 = 2.4f;
        System.out.println(f1 + f2);
        //Retourne "5,6000004"
        //Pour contourner ce problème, on utilise l'object primitif : BigDecimal
        //BigDecimal attend un élément de type String
        BigDecimal bd1 = new BigDecimal("3.2");
        BigDecimal bd2 = new BigDecimal("2.4");
        System.out.println(bd1.add(bd2));

        //Structure conditionnelle minifiée
        int nb6 = 20;
        if(nb6 == 20) System.out.println();
        //est équivalent à
        if(nb6 == 20){
            System.out.println();
        }
        //Structure ternaire
        boolean ok = (nb6 == 20) ? true : false;
        //Condition vérifiée : true sinon faulse

        //Minification de conditions
        boolean access = true;
        if(acces == true)
        if(access){
            //blablabla
        }
        if(acces == false)
            if(!access){
                //blablabla
            }

        //boucle infinie (plutôt utilisée dans les jeux vidéos)
        while(true){
            if(nb1 > 200) break;
            System.out.println(nb1);
            nb1++;
        }

        int[] myTab;
        myTab = new int[7];
        while(nb1 < myTab.length){
            //blablabla
        }

        //Utilisation de math
        int nb10 = 9;
        System.out.println("La racine carrée de " + nb10 + " est " + Math.sqrt(nb10));
        System.out.println("Puissances multiples :" + Math.pow(3,Math.pow(2, 2)));


        //STATIC --> variable : commun à tous les objets
        //FINAL --> variable : déclaration d'un constante, on y touche plus après

        //STATIC --> methode : on ne va pas pouvoir utiliser des attributs non statiques
    }
}
