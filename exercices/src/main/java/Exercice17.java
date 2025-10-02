import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir age : ");
        int age = sc.nextInt();
        System.out.print("Saisir salaire : ");
        double salaire = sc.nextDouble();
        System.out.print("Saisir annee d'expérience : ");
        int annee = sc.nextInt();

        if(age < 30)
            System.out.println("Vous être trop jeunes.");

        if(salaire > 40000)
            System.out.println("Vous demandez trop.");

        if(annee < 5)
            System.out.println("Vous n'avez pas assez d'expérience");

    }
}
