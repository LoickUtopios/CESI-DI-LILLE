import java.util.Scanner;

public class Demo5_Conditions {
    public static void main(String[] args) {

        // si
        if(3 > 2) {
            System.out.println("3 est supérieur à 2 !!!");
        }

        if(3 > 2) System.out.println("3 est supérieur à 2 !!!");

        if(3 > 2)
            System.out.println("3 est supérieur à 2 !!!");

        // If...else if...else
        double note = 18;

        if(note >= 16)
            System.out.println("Très bien !");
        else if(note >= 14)
            System.out.println("Bien !");
        else if(note >= 12){
            System.out.println("Assez bien");
            System.out.println("Peut mieux faire");
        }
        else
            System.out.println("Bof");

        // Ternaire (condition ? valeurSiVrai : valeurSiFaux)
        String appreciation = note > 15 ? "Super !" : "Pas super";
        System.out.println(appreciation);

        System.out.println("1. Dire bonjour");
        System.out.println("2. Dire au revoir");
        System.out.println("3. Dire bonne nuit");

        int choix = new Scanner(System.in).nextInt();

        switch (choix){
            case 1:
                System.out.println("Bonjour !!!");
                System.out.println("Tout le monde !!");
                break;
            case 2:
                System.out.println("Au revoir !");
                break;
            case 3:
                System.out.println("Bonne nuit !");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix Oo");
        }

        switch (choix){
            case 1 -> {
                System.out.println("Bonjour !!");
            }
            case 2 -> System.out.println("Au revoir !!");
            case 3 -> System.out.println("Bonne nuit !!");
            default -> System.out.println("Je n'ai pas compris");
        }

        String test = "";

        test = switch (choix){
            case 1 -> "Bonjour !!";
            case 2 -> "Au revoir !!";
            case 3 -> "Bonne nuit !!";
            default -> "Je n'ai pas compris";
        };
        System.out.println(test);

    }
}