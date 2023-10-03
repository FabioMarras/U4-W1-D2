public class Esercizio1 {
    public static void main(String[] args) {
        String x = "ciao";
        String y = "ciaoo";

        if (x.length() % 2 == 0) {
            System.out.println(true);;
        } else {
            System.out.println(false);
        }
        if (y.length() % 2 == 0) {
            System.out.println(true);;
        } else {
            System.out.println(false);
        }

        int anno = 2024;
        int anno2 = 2025;

//        if (anno % 4 == 0 || 100 == 0 && 400 == 0) {
            if (anno % 100 == 0 && 400 == 0 || anno % 4 == 0) {
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno NON bisestile");
        }
    }
}
