public class Exceptions {

    public static void main(String[] args) {
        //GESTION DES EXCEPTIONS

        int a = 10, b = 0;
        //Forcer erreur de division par zéro
        //Le try catch fonctionne comme un "switch case"
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Erreur de division par zéro. Erreur java : " + e);
        //Pourquoi s'embêter avec ArithmeticException ? "Exception" seul fonction pourtant...
        } catch (Exception e){
            System.out.println("Erreur de division par zéro (mais plus lente au traitement...). Erreur java : " + e);
        // Spécifier l'erreur permet :
        // - d'organiser son code en fonction du type d'erreur
        // - et surtout la vitesse de traitement !! (en effet, il y a plus de 300 tests différents avec "Exception" !!)
        // Donc, en général : favoriser la spécification du type d'erreur

        //Les fichiers sont souvent un gros problème en programmation. Pour la gestion des flux,
        //il faut pouvoir gérer les problème liés aux fichiers (formatage, nom, etc...). Idem pour la
        //connexion à une base de données.

        //Usage du "finally" : exemple typique d'utilisation : fermeture d'une connexion à une BDD
        } finally {
            //do something -> close connection
            System.out.println("Finally check !");
        }

    }
}
