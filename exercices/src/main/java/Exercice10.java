import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir le nombre 1 : ");
        int nb1 = sc.nextInt();
        System.out.print("Saisir le nombre 2 : ");
        int nb2 = sc.nextInt();
        System.out.print("Saisir le nombre 3 : ");
        int nb3 = sc.nextInt();

        int max;
        if(nb1 >= nb2 && nb1 >= nb3)
            max = nb1;
        else if(nb2 >= nb1 && nb2 >= nb3)
            max = nb2;
        else
            max = nb3;

        System.out.println("La valeur maximale est : " + max);

    }
}
