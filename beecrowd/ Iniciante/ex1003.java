import java.io.IOException;
import java.util.Scanner;

public class ex1003 {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        int soma = scanner.nextInt();
        soma += scanner.nextInt();

        System.out.println("SOMA = "+soma);

        scanner.close();
    }
}