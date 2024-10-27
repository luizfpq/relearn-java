import java.io.IOException;
import java.util.Scanner;

public class ex1011 {

    public static void main(String args[]) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        double volume = scanner.nextDouble();
        volume = (4.0/3) * 3.14159 * Math.pow(volume, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();


    }
}