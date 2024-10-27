import java.io.IOException;
import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();
        scanner.close();

        int[]    valores = {365,30,1};
        String[] labels  = {"ano(s)", "mes(es)", "dia(s)"};

        for(int i = 0; i < valores.length; i++) {
            System.out.printf("%d %s%n", dias / valores[i], labels[i]);
            dias %= valores[i];
        }
    }
}
