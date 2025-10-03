import java.util.Scanner;

public class Exercice36 {

    public static Scanner sc = new Scanner(System.in);

    public static boolean verificationADN(String saisie){
        for(int i = 0; i < saisie.length() ; i++){
            char c = saisie.charAt(i);

            if(c != 'a' && c != 't' & c != 'c' && c != 'g')
                return false;
        }
        return true;
    }

    public static String saisieADN(String question){
        System.out.print(question);
        String saisie = sc.nextLine();
        saisie = saisie.replace(" ", "").toLowerCase();

        if(verificationADN(saisie))
            return saisie;

        return null;
    }

    public static double proportion(String chaine, String sequence){
        if(sequence.length() > chaine.length())
            return 0.0;

        int index;
        int cptSequence = 0;
        String temp = chaine;

        while(true){
            index = temp.indexOf(sequence);

            if(index == -1)
                break;
            else{
                temp = temp.substring(index + sequence.length());
                cptSequence++;
            }
        }

        return (double) (cptSequence * sequence.length()) / chaine.length() * 100;
    }

    public static void main(String[] args) {

        String chaine = saisieADN("Veuillez entrer une chaine ADN : ");
        String sequence = saisieADN("Veuillez entrer une sequence ADN : ");
        if(chaine == null || sequence == null)
            System.out.println("Erreur de saisie");

        System.out.printf("Il y a %.2f%% de '%s' dans '%s'", proportion(chaine, sequence), sequence, chaine);
    }
}
