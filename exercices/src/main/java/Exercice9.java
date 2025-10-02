import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        int nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        nombre = sc.nextInt();

        System.out.println("Le nombre saisie est " + (nombre % 2 == 0 ? "pair" : "impair"));
    }
}
