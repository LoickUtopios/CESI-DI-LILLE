import java.sql.Array;
import java.util.Arrays;
import java.util.SortedMap;

public class Demo7_Tableaux {
    public static void main(String[] args) {
        // Déclaration d'un tableau
        int[] ages;

        // Allocation de la mémoire pour 5 entiers
        ages = new int[5];

        // int[] ages = new int[5];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        ages[4] = 50;

        System.out.println("Element à l'index 0 : " + ages[0]);
        System.out.println("Element à l'index 1 : " + ages[1]);
        System.out.println("Element à l'index 2 : " + ages[2]);
        System.out.println("Element à l'index 3 : " + ages[3]);
        System.out.println("Element à l'index 4 : " + ages[4]);

        // Affichage de notre tableau sous forme de chaine
        System.out.println(Arrays.toString(ages));

        // Taille de mon tableau
        System.out.println("Taille du tableau = "+ ages.length);

        // Parcours de notre tableau via for
        for(int i = 0; i < ages.length ; i++){
            System.out.println("Element à l'index " + i + " : " + ages[i]);
        }

        // Parcours avec un foreach
        for(int val : ages){
            System.out.println(val);
        }

        // Déclarer, allouer et initialiser un tableau
        String[] mots = {"Bonjour", "toto", "tata"};
        System.out.println(mots.length);
        System.out.println(Arrays.toString(mots));

        // Matrice
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrice[1][2]); // 6
        // System.out.println(matrice[0][3]); // Error OutOfBound

        System.out.println(matrice.length);
        System.out.println(matrice[0].length);

        int valTotal=0;
        for(int[] tab : matrice){
            valTotal += tab.length;
        }

        System.out.println("Il y a " + valTotal + " valeur(s) dans la matrice.");

        // Copie de tableau
        // Fausse copie (copie des références)
        int[] tab1 = {1,2,3,4,5};
        int[] tab2 = tab1;

        tab2[0] = 10;
        System.out.println("=== FAUSSE COPIE ===");
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));


        // Vrai copie
        int[] tab3 = tab1.clone();
        int[] tab4 = Arrays.copyOf(tab1, tab1.length);

        tab3[0] = 55;
        tab4[0] = 123;

        System.out.println("=== VRAI COPIE ===");
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab3));
        System.out.println(Arrays.toString(tab4));

     }
}
