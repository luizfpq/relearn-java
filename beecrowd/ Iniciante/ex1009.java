import java.io.IOException;
import java.util.Scanner;

public class ex1009 {
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double a    = scanner.nextDouble();
        double b    = scanner.nextDouble();


        scanner.close();

        double total = a + (b * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
