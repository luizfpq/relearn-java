import java.io.IOException;
import java.util.Scanner;

public class ex1007 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        scanner.close();

        int diferenca = a * b - c * d;

        System.out.printf("DIFERENCA = %d%n", diferenca);
    }
}
