import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longueur;

        System.out.print("Saisir la longueur d'un coté : ");
        longueur = sc.nextInt();

        int perimetre = longueur * 4;
        double aire = Math.pow(longueur, 2);

        System.out.println("Le périmètre du carré est de : " + perimetre + "cm");
        System.out.println("L'aire du carré est de : " + aire + "cm carrée");
    }
}
