import java.util.Scanner;

public class Exercice22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nb = sc.nextInt();

        int sum;
        String allNb;

        for (int i = 1; i <= (nb / 2) ; i++){
            sum = 0;
            allNb = "";
            for(int j = i; ; j++){
                sum += j;
                allNb += j;
                if(sum == nb)
                    System.out.println(nb + " = " + allNb);

                allNb += " + ";
                if(sum > nb)
                    break;
            }
        }
    }
}
