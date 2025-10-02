import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un age : ");
        age = sc.nextInt();

        if(age >= 18)
            System.out.println("Vous êtes majeur, vous pouvez rentrer.");
        else
            System.out.println("Vous êtes mineur, vous ne pouvez pas rentrer.");
    }
}
