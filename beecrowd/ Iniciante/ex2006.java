import java.io.IOException;
 
public class ex2006 {
 
    public static void main(String[] args) throws IOException {
 
        int T = System.in.read() - '0';

        // Pulando o espaço após o tipo de chá
        System.in.read();

        int acertos = 0;
        for (int i = 0; i < 5; i++) {
            int resposta = System.in.read() - '0';
            if (resposta == T) {
                acertos++;
            }
            // Pula o espaço entre os números (não é necessário no último número)
            if (i < 4) {
                System.in.read();
            }
        }
        System.out.println(acertos);
 
    }
 
}