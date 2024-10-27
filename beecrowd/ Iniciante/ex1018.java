import java.io.IOException;
import java.util.Scanner;

public class ex1018 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        scanner.close();

        System.out.printf("%d%n", valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %d,00%n", quantidade, nota);
        }

    }
}
