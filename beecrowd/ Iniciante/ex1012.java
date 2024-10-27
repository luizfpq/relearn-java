import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lê os valores A, B e C
        String[] input = reader.readLine().split(" ");
        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);
        double C = Double.parseDouble(input[2]);

        // Constantes e cálculos intermediários
        final double PI = 3.14159;
        double C2 = C * C;       // Pré-calcula C² para uso em várias áreas

        // Cálculos das áreas
        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = PI * C2;
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        // Exibe os resultados com 3 casas decimais, utilizando System.out.format para evitar o overhead do printf
        System.out.format("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.format("CIRCULO: %.3f%n", areaCirculo);
        System.out.format("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.format("QUADRADO: %.3f%n", areaQuadrado);
        System.out.format("RETANGULO: %.3f%n", areaRetangulo);
    }
}
