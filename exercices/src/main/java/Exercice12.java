import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jour = sc.nextInt();



        switch (jour){
            case 1 :
                System.out.println("Lundi");
                break;
            case 2 :
                System.out.println("Mardi");
                break;
            case 3 :
                System.out.println("Mercredi");
                break;
            case 4 :
                System.out.println("Jeudi");
                break;
            case 5 :
                System.out.println("Vendredi");
                break;
            case 6 :
                System.out.println("Samedi");
                break;
            case 7 :
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Erreur (nb entre 1 et 7)");
                break;
        }


        String jourStr = switch (jour){
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            case 4 -> "Jeudi";
            case 5 -> "Vendredi";
            case 6 -> "Samedi";
            case 7 -> "Dimanche";
            default -> "Erreur (nb entre 1 et 7)";
        };
        System.out.println(jourStr);

        if(jour > 0 && jour <= 7){
            String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
            System.out.println(jours[jour-1]);
        } else
            System.out.println("Jour erroné");

    }
}
