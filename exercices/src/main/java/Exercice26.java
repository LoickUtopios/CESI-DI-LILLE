import java.util.Scanner;

public class Exercice26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int nb = Math.abs(sc.nextInt());

        String facStr = "";
        int factoriel = 1;
        for(int i = 1 ; i <= nb; i++){
            factoriel *= i;
            facStr += i;

            if(i != nb)
                facStr += " x ";
        }
        System.out.println(nb + "! = " + facStr + " = " + factoriel);
    }
}
