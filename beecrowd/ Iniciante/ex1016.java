import java.io.IOException;
import java.util.Scanner;
public class ex1016 {
    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int kms = scanner.nextInt();

        scanner.close();

        System.out.printf("%d minutos%n", kms*2);

    }
}
