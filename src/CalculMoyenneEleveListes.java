import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CalculMoyenneEleveListes {

    final private static DecimalFormat df = new DecimalFormat("0.00");
    final private static ArrayList<Float> eleveNotes = new ArrayList<>();
    final private static ArrayList<String> eleves = new ArrayList<>();
    final private static String[] elevesTab = new String[]{"Fréderic", "Redouane", "Magomed", "Khawla", "Cevdet"};
    final private static Scanner scan =new Scanner(System.in);
    final private static Random r = new Random();
    final static float min = 0;
    final static float max = 20;
    static int i;

    public static void main(String[] args) {

        for (i = 0; i<elevesTab.length; i++){
            eleves.add(elevesTab[i]);
        }

        for (i = 0; i<eleves.size(); i++){
            float random = min + r.nextFloat() * (max - min);
            eleveNotes.add(random);
        }

        System.out.println("Nouvelle note ?");
        String nouvelEleve = scan.next();
        if (nouvelEleve.equalsIgnoreCase("oui")){
            nouvelleNote();
        }

        System.out.println("Trouver élève ?");
        String trouverEleve = scan.next();
        if (trouverEleve.equalsIgnoreCase("oui")){
            System.out.println("Nom élève ?");
            String nomEleve = scan.next();
            int idx=indexEleve(nomEleve);
            if (idx == -1){
                System.out.println("Cet élève n'a pas été trouvé");
            } else {
                System.out.println("Cet élève est à l'index " + idx);
                System.out.println("Déplacer élève ?");
                String deplacerTxt = scan.next();
                if (deplacerTxt.equalsIgnoreCase("oui")){
                    System.out.println("Nouvelle position ? [1 à " + (eleves.size()) + "]");
                    int nouvellePosition = scan.nextInt();
                    if (nouvellePosition <= 0 && nouvellePosition >= (eleves.size())){
                        eleves.add(nouvellePosition, eleves.get(idx));
                        eleveNotes.add(nouvellePosition, eleveNotes.get(idx));
                        eleves.remove(idx);
                        eleveNotes.remove(idx);
                        //TODO
                    } else {
                        System.out.println("En dehors de l'écart");
                    }
                }
            }
        } else {
            System.out.println("Vous n'avez pas cherché d'élève");
        }

        //Affichage des élèves et des notes
        for (i=0; i<eleveNotes.size(); i++){
            System.out.println(eleves.get(i) + " : " + df.format(eleveNotes.get(i).floatValue()));
        }
    }

    private static void nouvelleNote(){
        boolean newNote = true;
        do{
            System.out.println("Nom de l'élève :");
            String eleve = scan.next();
            eleves.add(eleve);
            System.out.println("Note :");
            Float nouvelleNote = scan.nextFloat();
            eleveNotes.add(nouvelleNote);
            System.out.println("Nouvelle note ?");
            String nouvelEleve = scan.next();
            if (nouvelEleve.equalsIgnoreCase("non")){
                newNote = false;
            } else {
                newNote = true;
            }
        }
        while (newNote == true);
    }

    private static int indexEleve(String nomEleve){
        if (eleves.contains(nomEleve)){
            return eleves.indexOf(nomEleve);
        } else {
            return -1;
        }
    }

}


