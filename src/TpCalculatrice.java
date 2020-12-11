import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TpCalculatrice {

    final private static Scanner scan = new Scanner(System.in);
    final private static ArrayList<String> myEmojis = new ArrayList<>();
    final private static Random r = new Random();

    public static void main(String[] args) {

        myEmojis.addAll(Arrays.asList("ヾ(ｏ･ω･)ﾉ", "ヽ(。_°)ノ", "((╬ಠิ﹏ಠิ))", "(－‸ლ)", "ಠಿ_ಠ", "(•̪●)", "(´･_･`)", "(⊙.☉)7"));
        int min = 0;
        int max = myEmojis.size();
        BigDecimal number;
        BigDecimal number2;
        String operator;
        do {
            System.out.println("--- Dentaku (2 nombres et 1 opérateur) ---");
            System.out.println("Votre premier nombre : (╯°□°)╯︵ ┻━┻");
            number = scan.nextBigDecimal();

            System.out.println("Votre deuxième nombre : ┬─┬ノ( º _ ºノ)");
            number2 = scan.nextBigDecimal();
            System.out.println("Opérateur : (っ˘з(˘⌣˘ )\n" +
                    "        A : Additionner\n" +
                    "        S : Soustraire\n" +
                    "        M : Multiplier\n" +
                    "        D : Diviser\n" +
                    "        Q : Quitter\n" +
                    "Votre choix : ( ˘ ³˘)♥");
            operator = scan.next();

            float random = min + r.nextFloat() * (max - min);
            switch (operator.toUpperCase()) {
                case "A" -> System.out.println(number.add(number2));
                case "S" -> System.out.println(number.subtract(number2));
                case "M" -> System.out.println(number.multiply(number2));
                case "D" -> System.out.println(number.divide(number2, 8,RoundingMode.HALF_UP));
                default -> System.out.println(myEmojis.get((int) random));
            }
        } while (!operator.equalsIgnoreCase("Q"));
    }
}
