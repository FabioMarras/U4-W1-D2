import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        System.out.println("Scrivi");
        String uno = input.nextLine();
        while (!uno.equals(":q")) {
            System.out.println("Per finire scrivi :q");
            uno = input.nextLine();
            String[] arrSTR= uno.split("");
            System.out.println(String.join(",", arrSTR));
        }
            input.close();
    }
}
