import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lê os dois inteiros em linhas separadas
        int prod = Integer.parseInt(reader.readLine());
        prod *= Integer.parseInt(reader.readLine());

        // Imprime o resultado formatado
        System.out.printf("PROD = %d%n", prod);
    }
}