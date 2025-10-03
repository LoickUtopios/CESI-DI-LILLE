public class Demo1bis_cast {
    public static void main(String[] args) {
        // Cast implicite (plus petit vers plus grand)
        byte unByte = 5;
        short unShort = unByte;
        int unInt = unShort;
        long unLong = unInt;

        unLong = 123456L;

        // Cast explicite
        unByte = (byte) unLong;
        System.out.println(unByte);

        // Parse
        String nombre = "123";
        int nb = Integer.parseInt(nombre);

        String valeur = Integer.toString(nb);
        System.out.println(valeur);
    }
}
