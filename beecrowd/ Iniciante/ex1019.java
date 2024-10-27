import java.io.IOException;
import java.util.Scanner;

public class ex1019 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("%d:", n/3600);
        n %= 3600;
        System.out.printf("%d:", n/60);
        n %= 60;
        System.out.printf("%d%n", n);
    }
}
