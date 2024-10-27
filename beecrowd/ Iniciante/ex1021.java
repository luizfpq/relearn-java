import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double valor = Double.parseDouble(reader.readLine());

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        int valorInteiro = (int) valor;
        int valorCentavos = (int) Math.round((valor - valorInteiro) * 100);

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = valorInteiro / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, (double) nota);
            valorInteiro %= nota;
        }

        System.out.println("MOEDAS:");
        valorCentavos += valorInteiro * 100;  // Inclui qualquer valor inteiro restante como centavos
        for (int moeda : moedas) {
            int quantidadeMoedas = valorCentavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
            valorCentavos %= moeda;
        }
    }
}
