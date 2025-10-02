import java.util.Scanner;

public class Exercice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre de notes : ");
        int nbNote = sc.nextInt();

        int note;
        int max = Integer.MIN_VALUE;
        int cpt = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        do{
            System.out.print("Saisir la note : ");
            note = sc.nextInt();

            if(note < 0 || note > 20)
                System.out.println("Excusez moi, mais pourriez vous faire attention (note entre 0 et 20)");
            else {
                cpt++;
                sum += note;
                max = max > note ? max : note;
                min = min < note ? min : note;
            }

        }while (cpt < nbNote);

        double avg = sum / nbNote;
        System.out.println("""
                La note maximale est %d
                La note minimal est %d
                La moyenne des notes est de %.2f
                """.formatted(max, min, avg));
    }
}
