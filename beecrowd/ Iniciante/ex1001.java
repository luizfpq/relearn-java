import java.io.IOException;
import java.util.Scanner;

public class ex1001 {

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        x += scanner.nextInt();

        System.out.println("X = "+x);

        scanner.close();
    }
}