import java.util.Arrays;

public class Exercice29 {
    public static void main(String[] args) {
        int[] tableauSource = {-5 , 3, 24, -12, -10, 5, 100 ,-2 , -71, 0};
        int[] tableauDestination = new int[tableauSource.length];

        int indexDestination = 0;
        for (int val : tableauSource) {
            if (val >= 0) {
                tableauDestination[indexDestination] = val;
                indexDestination++;
            }
        }

        System.out.println("tableauSource = " + Arrays.toString(tableauSource));
        System.out.println("tableauDestination = " + Arrays.toString(tableauDestination));
    }
}
