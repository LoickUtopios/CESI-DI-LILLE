import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rayon;
        int hauteur;

        System.out.print("Saisir rayon :");
        rayon = sc.nextInt();
        System.out.print("Saisir hauteur :");
        hauteur = sc.nextInt();

        double volume = 1/3f * Math.PI * Math.pow(rayon,2) * hauteur;
        System.out.printf("Le volume du cône est de %.2f cm3", volume);
        sc.close();
    }
}
