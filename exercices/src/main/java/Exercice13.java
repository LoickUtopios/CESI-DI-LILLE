import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mois = sc.nextInt();

        String result = switch (mois){
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 2 -> "28";
            default -> "30";
        };

        System.out.println("Le mois n°" + mois + " posséde " + result + " jours.");
    }
}
