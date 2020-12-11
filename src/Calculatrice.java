import java.util.Scanner;

public class Calculatrice {

    final private static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Premier chiffre :");
        double dbl1 = scan.nextDouble();
        System.out.println("Deuxieme chiffre :");
        double dbl2 = scan.nextDouble();

        //Idéalement -> faire ces calculs dans l'affichage directement, c'est moins coûteux
        double addi = dbl1 + dbl2;
        double sous = dbl1 - dbl2;
        double mult = dbl1 * dbl2;
        float divi = (float) dbl1 / (float) dbl2;

        System.out.println("Additionner : "+ String.format("%.02f", addi)  +
                "\nSoustraire : "+ String.format("%.02f", sous) +
                "\nMultiplier : "+ String.format("%.02f", mult) +
                "\nDiviser : " + String.format("%.02f", divi));
    }
}
