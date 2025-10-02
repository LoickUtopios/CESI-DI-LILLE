import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Saisir un age : ");
        age = sc.nextInt();

        boolean estMajeur = age >= 18;
        System.out.println(estMajeur);

        sc.close();
    }
}
