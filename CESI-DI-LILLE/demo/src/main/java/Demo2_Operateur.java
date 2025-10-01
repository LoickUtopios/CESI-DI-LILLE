public class Demo2_Operateur {
    public static void main(String[] args) {
        // Operateur arithmétique
        int result = 1 + 1;
        System.out.println("1 + 1 = " + result); // 1 + 1 = 2 => concaténation

        // Les primitives ne copie pas la référence mémoire
        int originalResult = result;
        result = result - 1;
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;

        result = result * 2; // 2
        result = result / 2; // 1
        result = 25 % 5; // 0

        // Operateur d'affectation
        int nombre = 5; // 5
        nombre += 10; // 15 => nombre = nombre + 10;
        nombre -= 3; // 12
        nombre *= 2; // 24
        nombre /= 2; // 12

        // Opérateur logiques
        boolean test = true;
        boolean test2 = false;

        // ET
        System.out.println(test && test2); // false
        // OU
        System.out.println(test || test2); // true
        System.out.println(true && (true || false)); // true
        System.out.println(false || (true && false) || true); // true
        // NOT
        System.out.println(!test); // false

        // Opérateurs d'incrémentation/décrémentation
        int compteur = 5;
        compteur++;
        System.out.println(compteur); // 6
        System.out.println(compteur++); // 6
        System.out.println(compteur); // 7

        compteur--;
        System.out.println(compteur); // 6
        System.out.println(--compteur); // 5
        System.out.println(compteur--);// 5
        System.out.println(compteur); // 4

        // Opérateur d'égalité
        int val1 = 1;
        int val2 = 2;

        boolean resultat = val1 == val2; // false
        System.out.println(resultat);

        resultat = val1 < val2; // true
        resultat = val2 >= val1; // true
        resultat = (val1 == 1) && (val2 == 2); // true

        // je souhaite afficher quelque chose

        String prenom = "Toto";
        String autrePrenom = "Titi";
        System.out.println(prenom == autrePrenom); // false
        autrePrenom = "Toto";
        System.out.println(prenom == autrePrenom); // true
        autrePrenom = prenom;
        System.out.println(prenom == autrePrenom); // true


    }
}