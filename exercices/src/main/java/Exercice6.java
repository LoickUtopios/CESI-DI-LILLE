import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine;

        System.out.print("Saisir une chaine :");
        chaine = sc.nextLine().trim();

        System.out.println("En minuscule : " + chaine.toLowerCase());
        System.out.println("En majuscule : " + chaine.toUpperCase());

        System.out.println("Bonjour je m'appelle Toto".toUpperCase());

        String result = "";
        for (int i = 0; i < chaine.length() ; i++){
            result += chaine.charAt(i);
            result += ",";
        }
        System.out.println("En tableau : " + result);

        String capitalize = "";
        String[] mots = chaine.split(" ");

        for (int i = 0; i < mots.length; i++){
            capitalize += mots[i].toUpperCase().charAt(0);
            capitalize += mots[i].substring(1).toLowerCase();
            capitalize += " ";
        }
        System.out.println("Premiere lettre en majuscule : " + capitalize);

        sc.close();
    }
}
