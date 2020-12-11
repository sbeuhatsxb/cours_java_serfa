import java.util.ArrayList;
import java.util.Scanner;

public class ListeCourse {

    final private static ArrayList<String> listeCourses = new ArrayList<>();
    final private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int i;
        int number;
        int idx;

        do {
            System.out.println("Votre liste de course :\n" +
                    "        1 : ajouter\n" +
                    "        2 : supprimer\n" +
                    "        3 : modifier\n" +
                    "        4 : afficher la liste\n" +
                    "        5 : quitter\n" +
                    "Votre choix :");

            number = scan.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Aliment à ajouter :");
                    String item = scan.next();
                    listeCourses.add(item);
                    break;
                case 2:
                    System.out.println("Aliment à supprimer:");
                    item = scan.next();
                    idx = indexItem(item);
                    if(idx < 0){
                        System.out.println("Cet aliment n'existe pas");
                    } else {
                        listeCourses.remove(idx);
                        System.out.println("Aliment supprimé");
                    }
                    break;
                case 3:
                    System.out.println("Aliment à modifier:");
                    item = scan.next();
                    idx = indexItem(item);
                    if(idx < 0) {
                        System.out.println("Cet aliment n'existe pas");
                    } else {
                        System.out.println("Nouvel aliment:");
                        String newItem = scan.next();
                        listeCourses.set(idx, newItem);
                    }
                    break;
                case 4:
                    for (i = 0; i < listeCourses.size(); i++) {
                        System.out.println(listeCourses.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Bonne courses !");
                    break;
                default:
                    number = 5;
                    System.out.println("Bonne courses !!");
            }
        } while (number != 5);

    }

    private static int indexItem(String item){
        if (listeCourses.contains(item)){
            return listeCourses.indexOf(item);
        } else {
            return -1;
        }
    }
}
