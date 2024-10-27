import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ex3089 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] presents = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                presents[i] = sc.nextInt();
            }

            Arrays.sort(presents);

            int[] pairs = new int[n];
            for (int i = 0; i < n; i++) {
                pairs[i] = presents[i] + presents[2 * n - i - 1];
            }

            Arrays.sort(pairs);

            int minPrice = pairs[0];
            int maxPrice = pairs[n - 1];

            System.out.println(maxPrice + " " + minPrice);
        }

        sc.close();
    }
}