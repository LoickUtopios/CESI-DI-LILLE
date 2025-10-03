public class Exercice28 {
    public static void main(String[] args) {
        int[] tab = new int[100];

        for(int i = 0; i < tab.length ; i++){
            tab[i] = i;
        }

        for(int i = 0; i < tab.length ; i++){
            System.out.printf("%3d, ", tab[i]);

            if(i == tab.length-1)
                break;

            if(tab[i+1] % 10 == 0 && tab[i] != 0)
                System.out.println();
        }
    }
}
