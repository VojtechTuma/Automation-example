public class Example {

    public int field;

    public static final String CONSTANT = "Kocicka";

    public static void main(String[] args) {
        int cislo = 4;
        System.out.println(cislo);
        int abs = Math.abs(cislo);
    }

    public Example(){

    }

    int funkce(int cislo, String pismenka) {
        return cislo + pismenka.length();
    }
}
