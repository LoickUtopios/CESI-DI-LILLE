import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();

        System.out.println(degree < 0 ? "SOLIDE" : (degree < 100 ? "LIQUIDE" : "GAZEUX"));
    }
}
