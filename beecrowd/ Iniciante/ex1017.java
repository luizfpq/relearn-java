import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1017 {
    public static void main(String[] args) throws IOException{
        
        final double consumo = 12.0;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int tempo_viagem = Integer.parseInt(reader.readLine());
        int veloc_media  = Integer.parseInt(reader.readLine());

        System.out.format("%.3f%n", (tempo_viagem*veloc_media)/consumo);
    }
}
