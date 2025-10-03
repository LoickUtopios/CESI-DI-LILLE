public class Exercice33 {

    public static int soustraction (int a, int b){
        System.out.printf("Je soustrait %d et %d\n", a ,b);
        return a - b;
    }

    public static void main(String[] args) {
        int result = soustraction(2,1);
        System.out.println("Résultat : " +result);
    }
}
