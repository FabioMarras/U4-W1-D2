import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int uno = input.nextInt();
         for (int i = uno; i >= 0 ; i--){
             System.out.println(i);
         }
        input.close();
    }
}
