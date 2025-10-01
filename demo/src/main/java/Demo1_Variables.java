import java.util.Scanner;

public class Demo1_Variables {
    public static void main(String[] args){
        // Commentaire sur une ligne

        /*
            Commentaire
            sur plusieurs
            lignes
         */

        /**
         *  Javadoc
         */

        // type entier
        byte unByte;
        short unShort;
        int unInt;
        long unLong = 1_000_000L;

        // type decimaux
        float pi = 3.14f;
        double solde = 123456.789;

        // type boolean
        boolean estVrai = true;

        // type caractere
        char lettre = 'a';

        // chaine de caractere
        String prenom = "Toto";

        // Déclaration
        int age;

        // Affectation
        age = 30;

        System.out.println(prenom);
        System.out.println(age); // sout comme raccourci

        System.out.println(age++);

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println(userInput);
    }
}
