import java.util.Random;

public class Demo4_Utils {
    public static void main(String[] args) {
        // puissance
        double carre = Math.pow(5, 2);
        System.out.println("5² = " + carre);

        // Arrondi
        double salaire = 1234.51;

        System.out.println(Math.round(salaire));
        System.out.println(Math.floor(50.99));
        System.out.println(Math.ceil(50.01));

        // Constante
        double pi = Math.PI;

        // Min/Max
        int max = Math.max(10, 30);
        int min = Math.min(20, 22);

        // Random
        int nbRandom = (int) (Math.random() * 50); // Math.random() donne un nombre entre 0 et 1
        // ou
        Random random = new Random();
        int nbRandom2 = random.nextInt(-100,101);
    }
}
