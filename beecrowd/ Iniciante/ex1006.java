import java.io.IOException;
import java.util.Scanner;

public class ex1006 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        scanner.close();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
