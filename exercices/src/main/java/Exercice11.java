import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caractere = sc.nextLine().toLowerCase().charAt(0);

        boolean estVoyelle = caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'y' || caractere == 'u';

        if(estVoyelle)
            System.out.println("Le caractere saisie est une voyelle");
        else
            System.out.println("Le caractere saisie est une consonne");

        System.out.println("Le caractere saisie est une " + (estVoyelle ? "voyelle" : "consonne") );
    }
}
