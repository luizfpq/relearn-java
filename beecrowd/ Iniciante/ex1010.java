import java.io.IOException;
import java.util.Scanner;

public class ex1010 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Ler os dados da primeira peça
        String[] linha1 = scanner.nextLine().split(" ");
        int codigo1 = Integer.parseInt(linha1[0]);  // Código da peça 1
        int numero1 = Integer.parseInt(linha1[1]);   // Número de peças 1
        double valor1 = Double.parseDouble(linha1[2].replace(',', '.')); // Valor unitário da peça 1

        // Ler os dados da segunda peça
        String[] linha2 = scanner.nextLine().split(" ");
        int codigo2 = Integer.parseInt(linha2[0]);  // Código da peça 2
        int numero2 = Integer.parseInt(linha2[1]);   // Número de peças 2
        double valor2 = Double.parseDouble(linha2[2].replace(',', '.')); // Valor unitário da peça 1

        // Calcular o valor total a ser pago
        double total = (numero1 * valor1) + (numero2 * valor2);

        // Exibir o resultado formatado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }    
}
