import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3_Affichage {
    public static void main(String[] args) {
        // les différents print (println, print, printf)

        System.out.println("Bonjour");
        System.out.println("à tous !!");
        System.out.println();
        System.out.println("==============");
        System.out.print("Bonjour ");
        System.out.println("à tous !!");

        int age = 30;
        double poids = 90.0;
        String nom = "Toto";

        System.out.printf("\n\tNom: %s, Age: %d, Poids: %.2f kg\n", nom, age, poids);

        // \t tabulation
        System.out.println("Texte avec \t tabulation");

        // \b backspace
        System.out.println("Hello\bWorld!");

        // \n retour à la ligne
        System.out.println("\nHello\nWorld\n!!");

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        String nomUser = sc.nextLine();

        System.out.println("Bonjour ");
        System.out.println(nomUser);

        System.out.println("Votre prenom ?");
        String prenomUser = sc.next();
        System.out.println("Bonjour ");
        System.out.println(prenomUser);

        int ageUser = sc.nextInt();
        System.out.println("age : " + ageUser);

        sc.nextLine(); // Vide la touche entre laisse par le nextInt
        System.out.println("Veuillez ressaisir votre prenom ?");
        prenomUser = sc.nextLine();
        System.out.println("Bonjour " + prenomUser);

        // Fermer le scanner
        sc.close();
    }
}
