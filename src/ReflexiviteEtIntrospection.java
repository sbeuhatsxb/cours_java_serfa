import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflexiviteEtIntrospection {


    public static void main(String[] args) {
        //EN OBJET

        //Réflexivité et Introspection sont synonymes;

        //La classe mère la plus haute en Java est "Object"
        String sbeuh = new String();

        sbeuh.getClass().getSuperclass();
        //Renvoie la classe mère (juste au dessus), peut être chaîné :
        sbeuh.getClass().getSuperclass().getSuperclass();

        Method[] methodes = sbeuh.getClass().getMethods();
        //Affichage des méthodes :
        for(byte i = 0; i<methodes.length;i++){
            System.out.println(methodes[i]);
        }

        Field[] attributs = sbeuh.getClass().getDeclaredFields();
        //Affichage des attributs :
        for(byte i = 0; i<attributs.length;i++){
            System.out.println(attributs[i]);
        }

        Constructor[] constructeurs = sbeuh.getClass().getConstructors();
        //Affichage des constructeurs :
        for(byte i = 0; i<constructeurs.length;i++){
            System.out.println(constructeurs[i]);
        }
    }



}
