import java.util.Scanner;

public class Exercice27 {

    public static int factoriel(int nb){
        int factoriel = 1;
        for(int i = 1 ; i <= nb; i++){
            factoriel *= i;
        }
        return factoriel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int nb = Math.abs(sc.nextInt());


        int sum = 0;
        int chiffre = 0;
        int currentNb = nb;

        while(currentNb > 0){
            chiffre = currentNb % 10;
            currentNb /= 10;
            sum += factoriel(chiffre);

            if(sum > nb)
                break;
        }

        if(sum == nb)
            System.out.println(nb+ " est un nombre fort");
        else
            System.out.println(nb+ " n'est pas un nombre fort");
    }
}
