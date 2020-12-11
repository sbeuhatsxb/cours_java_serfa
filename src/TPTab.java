public class TPTab {
    public static void main(String[] args) {
        String nom[] = new String[]{"Pierre","Jacques","Marcel","Marie","Jean"};
        int intScore[] = new int[]{150, 50, 100, 100, 75};
        for (int i=0;i<nom.length;i++){
            System.out.println("« " + nom[i] + " a gagné " + intScore[i] + " points. »");
        }
    }
}
