import java.util.ArrayList;
import java.util.List;

public class Demo8_Fonctions {

    // Definition d'une méthodes
    // <visibilité> <type> <nomMethode> (parametres -> optionnels)
    public static void displayMessage(String message){ // Signature de méthode
        System.out.println(message);
    }

    public static int soustraire(int a, int b) {
        return a - b;
    }

    // Envoie par copie
    public static void modifierValeur(int a){
        a = 10;
        System.out.println(10);
    }

    // Envoie par référence
    public static void modifierReference(int[] tab){
        System.out.println(tab);
        tab[0] = 15;
        System.out.println(tab[0]);
    }

    public static void direBonjour(String... prenoms){
        System.out.print("Bonjour ");
        for (String prenom: prenoms){
            System.out.print(prenom + ", ");
        }
    }

    public static void main(String[] args) {

        // Appel de la méthode
        displayMessage("Hello World !");

        System.out.println(soustraire(5,3));

        System.out.printf("Je soustraire 5 à 3 : %d \n", soustraire(5,3));

        int a = 5;
        modifierValeur(a);
        System.out.println(a);

        int[] tab = {1, 2, 3, 4};
        modifierReference(tab);
        System.out.println(tab);
        System.out.println(tab[0]);

        direBonjour("Toto", "Tata", "Titi");

    }
}
