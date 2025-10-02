import java.util.Random;
import java.util.Scanner;

public class Exercice25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random = new Random().nextInt(1,101);

        int nb = 0;
        int cpt = 0;
        do{
            System.out.print("Saisir un nombre : ");
            nb = Math.abs(sc.nextInt());
            if(nb > random)
                System.out.println("Plus petit");

            if(nb < random)
                System.out.println("Plus grand");

            cpt++;
        }while(nb != random);

        System.out.println("Le nombre random était : " + random + " (en "+ cpt+" essaie(s))" );
    }
}
