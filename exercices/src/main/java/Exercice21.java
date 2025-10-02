public class Exercice21 {
    public static void main(String[] args) {
        final double ACC_POP = 0.89;
        final int INIT_POP = 96809;

        int currentPop = INIT_POP;
        int annee = 2015;

        while(currentPop < 120_000){
            currentPop += currentPop * (ACC_POP / 100);
            annee++;
        }

        System.out.println("La population de Tourcoing dépassera les 120 000 habitants en "+ annee +" pour environ "+ currentPop+" habitants");

    }
}
