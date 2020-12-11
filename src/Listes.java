import java.util.*;

public class Listes {
    public static void main(String[] args) {

        //COLLECTIONS
        //Les listes

        //LIST : Equilibre entre stockage et performances de lecture et d'écriture
        //MAP : Pour les clés-valeurs
        //SET : Pour le stockage en masse et le temps d'accès

        //__________________________________________________________________
        //LIST :
        //**********
        //ArrayList
        //**********
        //ArrayList implément les méthodes de List
        //On type en OBJET les listes avec des chevrons
        //La Liste est une interface où sont listés les méthodes que devront implementer les classes qui en ont besoin
        //ELLE GERE LE .add(null)
        //Très légère en mémoire, et très rapide en lecture
        //En revanche, elle est très lente en écriture et légère en mémoire
        ArrayList<Integer> myList = new ArrayList<>();


        //METHODES : https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        //Ajoute à la list
        myList.add(10); //{10}
        myList.add(11); //{10,11}
        myList.add(0,9); //{9,10,11}

        //Remplace à l'index (clé,valeur)
        myList.set(0,48); //{48,10,11}

        //Récupérer une valeur
        myList.get(0);  // --> 48

        //Supprimer un élément (supprime et la valeur et l'index)
        myList.remove(1); //{48,11}

        //Length
        myList.size();

        System.out.println(myList.toString());

        //Déclaration d'un tableau de la taille de ma liste
        int[] monTab = new int[myList.size()];

        System.out.println(myList.toArray().toString());

        //**********
        //LinkedList
        //**********
        //Accepte des type différents
        //Le problème c'est que pour accéder à une référence du tableau, il doit passer en revue
        //tous les éléments précédents !!
        //En fait, dans le LinkedList chaque élément est lié à son prédécesseur
        //Corrolaire : elle est excellente en écriture, il n'y a pas plus rapide !
        //Elle est moyenne en lecture en revanche (inverse de ArrayList) et donc lourde en mémoire
        //NB : NE GERE PAS .add(null)
        List liste = new LinkedList();
        liste.add("Chaine de caractères");
        liste.add(1000);
        liste.add(true);
        liste.add("Object"); //<- sans les guillemets, forcément.. ici : "serfa.Object@544252" s'il avait été déclaré
        //Surcharge de add() :
        liste.add(2, "deux"); //Permet d'intercaler des éléments ! :)
        liste.set(2, "deux"); //Permet d'écraser l'index 2

        liste.contains(1000); //renvoie un booleen (passe par un iterateur interne)

        //A NE PAS FAIRE !!
        for (int i = 0 ; i < liste.size(); i++){
            //En somme ici la boucle est faite 9 fois !!
            // 1 + 2 + 3 + 4 = 9
            System.out.println("Element : " + i + " : " + liste.get(i));
        }

        //MAIS IL EXISTE UN ITERATOR ! :

        ListIterator li = liste.listIterator();
        //Pour le boucler :
        li.forEachRemaining((alias) -> System.out.println(alias));
        //Equivaut à :
        while (li.hasNext()){
            System.out.println("Element : " + li.next());
        }
        //L'iterateur a parcouru la liste, donc l'itérateur est épuisé (il n'a plus de hasNext)
        //Il faut donc le réinitialiser si on veut reparcourir la ligne
        li = liste.listIterator();
        li.forEachRemaining((alias) -> System.out.println(alias));
        //NB : Fonction aussi avec les ArrayList !!
        li = myList.listIterator();
        li.forEachRemaining(alias -> System.out.println(alias));

        liste.clear(); //Vide la liste d'un coup !

        //__________________________________________________________________
        //LES MAPS fonctionnent sous clé -> valeur
        //Clé unique
        //Sa vitesse dépend de sa taille : plus elle est petite, plus elle est rapide (on va dire jusqu'à 1000)

        //**********
        //Hashtable
        //**********
        //N'accepte pas le null !
        // est THREADSAFE --> permet la lecture en cours de modification !!
        // équivalent du TABLE LOCK en SQL
        Hashtable ht = new Hashtable();
        ht.put(10, "printemps");
        ht.put(20, "été");
        ht.put(30, "automne");
        ht.put(40, "hiver");

        Enumeration en = ht.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        //**********
        //Hashmap //ABOUT TO BE DEPRECATED
        //**********
        //N'est pas THREADSAFE mais accepte le null !
        //ELLE EST EN COURS DE RETRAIT !!
        Map<String,String> capitales = new HashMap<>();
        capitales.put("France", "Paris");
        capitales.put("Angleterre", "Londre");
        //Renvoi 2
        capitales.size();
        //Renvoi Paris
        capitales.get("France");
        //Efface
        capitales.remove("France");
        capitales.put("France", "Paris");
        capitales.keySet(); //Récupère un set des clés
        capitales.values(); //Récupère un set des valeurs
        //On parcourt un HashMap avec un FOREACH
        for (String i: capitales.keySet()) {
            System.out.println("Key :" + i + " value " + capitales.get(i));
        }
        for (String i: capitales.values()) {
            System.out.println("value :" + i);
        }

        //__________________________________________________________________
        //SET :


        //**********
        //Hashset
        //**********
        //Non indexé !!
        //Set : collection où chaque ojet est unique
        //L'ajout d'un doublon est skipé
        //PREND UN ITERATEUR POUR LE PARCOURS !!!
        //Sont fait pour contenir énormément de données
        //performances moyennes en revanche
        //utilisation mémoire : moyenne
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo"); //Volvo n'apparaitra pas deux fois
        cars.add("Mazda");
        //Sensible à la casse
        cars.add("mazda");
        //Renvoi un booléen : sensible à la casse
        //Si le tableau contient la string
        cars.contains("mazda");

        //Parcours en foreach
        for (String marque: cars) {
            System.out.println(marque);
        }
        //Parcours en iterato
        Iterator<String> it = cars.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //__________________________________________________________________

    }
}
