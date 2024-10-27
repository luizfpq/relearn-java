import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2413 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t;

        t = Integer.parseInt(reader.readLine()); 
            System.out.println(t*4);
    }
}
