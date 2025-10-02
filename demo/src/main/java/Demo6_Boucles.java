import java.sql.Array;
import java.util.ArrayList;

public class Demo6_Boucles {
    public static void main(String[] args) {
        // While
        int compteur = 1;

        while(compteur < 10){
            System.out.println("Compteur est égale à : " + compteur);
            compteur++;
        }

        // Do While (boucle while qui s'execute au moins une fois)
        int nbr = 11;

        do {
            System.out.println("Nombre est : " + nbr);
            nbr++;
        }while (nbr < 10);

        // FOR
        for(int i = 0; i < 10 ; i++){
            System.out.println("Itération n°" + (i+1));
        }


        int i = 0;
        for(;;){
            if(i < 10)
                break;

            System.out.println("Itération n°" + (i+1));
            i++;
        }

        System.out.println("Decrémentation");
        for(i = 10; i > 0; i = i - 2){
            System.out.println("Itération n°" + i);
        }

        // Foreach
        String[] mots = {"Toto", "Tata", "Titi", "Tutu"};
        for(String mot : mots){
            System.out.println(mot);
        }

        // Break et Continue
        for(int cpt = 0; cpt < 10; cpt++){

            if(cpt == 5)
                continue;

            if(cpt == 7)
                break;

            System.out.println("Compteur est de : " + cpt);
        }

    }
}
