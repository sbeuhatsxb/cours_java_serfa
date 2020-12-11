import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListeTriee {

    final private static ArrayList<Integer> nombres = new ArrayList<>();
    final private static ArrayList<Integer> nombresDeranges = new ArrayList<>();
    final private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int i;
        int number;
        int pos = 0;

        for(i=0; i<=10; i++){
            nombres.add(i);
        }

        int longueurTab = nombres.size();

        do{
            System.out.println("Entrez un nombre (0 pour sortir)");
            number = scan.nextInt();

            if (number != 0){
                for(i=1; i<longueurTab;i++){
                    if(number >= nombres.get(i-1)){
                        pos = i;
                    }
                }
                nombres.add(pos, number);
            }
        } while (number != 0);

        for(i=1; i<nombres.size();i++){
            System.out.print(nombres.get(i) + " ");
        }

        System.out.println();

        for (i=0; i<20; i++){
            nombresDeranges.add(getRandomNumberInRange(1, 9));
            System.out.print(nombresDeranges.get(i));
        }

        for(i=0; i<nombresDeranges.size();i++){
            if(nombresDeranges.get(i) >= nombresDeranges.get(i+1)){
                int delta = nombresDeranges.get(i);
            }
        }

    }


    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
