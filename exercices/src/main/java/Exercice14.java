import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int annee = sc.nextInt();

        if((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0)
            System.out.println(annee + " est une année bissextile");
        else
            System.out.println(annee + " n'est pas une année bissextile");
    }
}
