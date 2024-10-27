import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1015 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        double x1 = Double.parseDouble(input[0]);
        double y1 = Double.parseDouble(input[1]);
       
        input = reader.readLine().split(" ");
        double x2 = Double.parseDouble(input[0]);
        double y2 = Double.parseDouble(input[1]);
        
        double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        System.out.format("%.4f%n", distance);

    }
}
