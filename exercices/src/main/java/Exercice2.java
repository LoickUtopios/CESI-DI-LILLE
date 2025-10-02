import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Saisir a :");
        a = sc.nextInt();
        System.out.print("Saisir b :");
        b = sc.nextInt();

        a = a + b ;
        b = a - b ;
        a = a - b ;

        System.out.println("a = " + a + " et b = " + b);
        sc.close();
    }
}
