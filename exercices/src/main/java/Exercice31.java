import java.util.Arrays;

public class Exercice31 {
    public static boolean checkArraysAreEquals(int[] tab1, int[] tab2){
        if(tab1.length != tab2.length)
            return false;

        for(int i = 0; i < tab1.length ; i++){
            if(tab1[i] != tab2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] tab1 = {1, 4, 2, 3};
        int[] tab2 = {1, 4, 2, 3};
        int[] tab3 = {1, 4, 3, 2};
        int[] tab4 = {1, 4, 2};

        displayResult(tab1, tab2);
        displayResult(tab1, tab3);
        displayResult(tab1, tab4);

    }

    private static void displayResult(int[] tab1, int[] tab2) {
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));

        if(checkArraysAreEquals(tab1, tab2))
            System.out.println("Les tableaux sont égaux");
        else
            System.out.println("les tableaux ne sont pas égaux");
    }
}
