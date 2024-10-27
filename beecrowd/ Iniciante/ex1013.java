import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        // Calcula o maior valor entre os três
        int maior = maiorAB(maiorAB(a, b), c);

        System.out.format("%d eh o maior%n", maior);
    }

    public static int maiorAB(int a, int b) {
        return (a > b) ? a : b;
    }
}