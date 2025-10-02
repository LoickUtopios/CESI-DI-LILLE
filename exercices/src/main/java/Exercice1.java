import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        String nom;
        String prenom;

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nom : ");
        nom = sc.nextLine();
        System.out.println("Saisir un prenom : ");
        prenom = sc.nextLine();

        System.out.println("Bonjour " + prenom + " " + nom);
        sc.close();
    }
}
