import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mdp;
        String mdps[] = {"motdepasse"};
        String user;
        String users[] = {"tiens", "tiens", "tiens", "voila", "voila", "sbeuh"};

        System.out.println("Quel est votre nom d'utilisateur ?");
        user = scan.nextLine();
        System.out.println("Quel est votre mot de passe ?");
        mdp = scan.nextLine();

        if (Arrays.stream(users).anyMatch(user::equalsIgnoreCase)){
            if (!Arrays.stream(mdps).anyMatch(mdp::equals)){
                System.out.println("Le mot de passe n'est pas le bon");
            } else {
                System.out.println("Vous êtes connecté");
            }
        } else {
            System.out.println("L'utilisateur n'est pas le bon");
        }

        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i] + ";");
        }

        switch (user){
            case "sbeuh" -> user = "sbeuh";
            case "osa" -> user = "qsd";
            default -> user = "wedontknow";
        }
        System.out.println(user);

        int nbMystere = (int)(Math.random()*10);
//        long nbMystere = new Random().nextLong();

        boolean engine = true;

        while (engine){
            System.out.println("Quel est le chiffre mystère ?");
            long nb = scan.nextLong();
            if (nb < nbMystere){
                System.out.println("Le nombre mystere est plus grand");
            } else if (nb > nbMystere){
                System.out.println("Le nombre mystere est plus petit");
            } else {
                System.out.println("Vous avez trouvé le nombre mystère : " + nbMystere);
                engine = false;
            }
        }


    }



}
