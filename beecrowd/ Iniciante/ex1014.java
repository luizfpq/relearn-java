import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex1014 {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int     dist = Integer.parseInt(reader.readLine());
        double  comb = Double.parseDouble(reader.readLine());
 
        System.out.format("%.3f km/l%n", dist/comb);

    }
}