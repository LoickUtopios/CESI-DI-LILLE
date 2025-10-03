import java.util.Locale;
import java.util.Scanner;

public class Exercice32 {

    public static String nomComplet(String nom, String prenom){
        nom = nom.toUpperCase().charAt(0) + nom.substring(1).toLowerCase();
        prenom = prenom.toUpperCase().charAt(0) + prenom.substring(1).toLowerCase();
        return prenom + " " + nom;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir nom : ");
        String nom = sc.nextLine();
        System.out.print("Saisir prénom : ");
        String prenom = sc.nextLine();

        System.out.println(nomComplet(nom, prenom));

    }
}
