import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre de chapitres : ");
        int nbChapitre = sc.nextInt();
        System.out.println("Saisir un nombre de sous-parties : ");
        int nbSub = sc.nextInt();

        for(int i = 0 ; i < nbChapitre ; i++){
            System.out.println("Chapitre " + (i+1));
            for(int j = 0; j < nbSub; j++){
                System.out.println("\tSous-partie " + (i+1) + "." + (j+1));
            }
        }
    }
}
