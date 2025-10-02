import java.util.Scanner;

public class Exercice24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre ( > 1) : ");
        int nb = Math.abs(sc.nextInt());
        boolean estPremier = true;

        if(nb <= 1)
            estPremier = false;
        else{
            for(int i = 2; i < nb; i++){
                if(nb % i == 0){
                    estPremier = false;
                    break;
                }
            }
        }

        if(estPremier)
            System.out.println(nb + " est un nombre premier");
        else
            System.out.println(nb + " n'est pas un nombre premier");


    }
}
