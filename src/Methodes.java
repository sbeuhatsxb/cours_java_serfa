public class Methodes {
    public static void main(String[] args) {
        //Etant donné que Java est un langage objet, il n'y a pas de function
        //Ce sont des METHODES !!
        direBonjour();
        direBonjour("Toto");
    }

    public static void direBonjour(){
        System.out.println("Bonjour ");
    }

    public static void direBonjour(String nom){
        System.out.println("Bonjour " + nom + " !");
    }
}
