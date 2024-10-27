import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex2006 {
 
    public static void main(String[] args) throws IOException {
 
         // Lê o tipo de chá real (primeiro caractere lido)
        int T = System.in.read() - '0';

        // Pulando o espaço após o tipo de chá
        System.in.read();

        int acertos = 0;

        // Leitura das cinco respostas e contagem das corretas
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

        // Exibe o número de respostas corretas
        System.out.println(acertos);
 
    }
 
}