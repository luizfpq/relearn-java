import java.io.IOException;
import java.util.Scanner;

public class ex1002 {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        double raio = scanner.nextDouble();
        double area = Math.pow(raio, 2) * 3.14159;

        System.out.printf("A=%.4f%n", area);
        
        scanner.close();
    }
}