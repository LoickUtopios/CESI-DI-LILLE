public class Exercice35 {
    public static int compterLettreA(String chaine){
        int cpt = 0;
        for(int i = 0; i < chaine.length() ; i++){
            if(chaine.charAt(i) == 'a')
                cpt++;
        }
        return cpt;
    }

    public static void main(String[] args) {
        String chaine1 = "C'est le b-a ba";
        String chaine2 = "mixer";

        System.out.println("Il y a " + compterLettreA(chaine1) + " 'a' dans '" + chaine1 + "'");
        System.out.println("Il y a " + compterLettreA(chaine2) + " 'a' dans '" + chaine2 + "'");
    }
}
