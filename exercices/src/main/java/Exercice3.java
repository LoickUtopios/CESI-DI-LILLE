import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Saisir a :");
        a = sc.nextInt();
        System.out.print("Saisir b :");
        b = sc.nextInt();

        double result = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("La somme des carrés de a et b est : " + result);
        sc.close();
    }
}