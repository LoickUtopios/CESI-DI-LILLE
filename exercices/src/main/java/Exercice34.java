public class Exercice34 {

    public static String quelleCategorie(int age){
        return switch (age){
            case 3,4,5,6 -> "Baby";
            case 7,8 -> "Poussin";
            case 9, 10 -> "Pupille";
            case 11, 12 -> "Minime";
            case 13, 14, 15, 16, 17, 18 -> "Cadet";
            default -> "Erreur";
        };
    }

    public static void main(String[] args) {
        int age = 20;
        System.out.println("Age : " + age + ", votre enfant est dans la catégorie : " + quelleCategorie(age));
    }
}
