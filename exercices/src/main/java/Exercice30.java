public class Exercice30 {
    public static void main(String[] args) {
        int[] tab = {23, 150, 12, 28, 59, 2};

        int max = Integer.MIN_VALUE;
        int indexMax = 0;

        for(int i = 0 ; i < tab.length ; i++){
            if(tab[i] > max){
                max = tab[i];
                indexMax = i;
            }
        }

        System.out.printf("La valeur maximale est %d à l'indice %d", max, indexMax);
    }
}
