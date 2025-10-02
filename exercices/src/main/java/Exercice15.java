import java.util.Scanner;

public class Exercice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().toLowerCase().charAt(0);

        if(Character.isAlphabetic(c))
            System.out.println("Le caractere " + c + " est une lettre.");
        else if(Character.isDigit(c))
            System.out.println("Le caractere " + c + " est un chiffre.");
        else
            System.out.println("Le caractere " + c + " est un caractere spécial.");
    }
}
