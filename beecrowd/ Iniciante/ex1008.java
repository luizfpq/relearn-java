import java.io.IOException;
import java.util.Scanner;

public class ex1008 {
    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int     id_number       = scanner.nextInt();
        int     worked_hours    = scanner.nextInt();
        double  value_hour      = scanner.nextDouble();

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", id_number, worked_hours*value_hour);

        scanner.close();

    }
}