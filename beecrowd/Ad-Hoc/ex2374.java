import java.util.Scanner;

public class ex2374 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diferenca = N - M;
        System.out.println(diferenca);
        scanner.close();
    }
}
