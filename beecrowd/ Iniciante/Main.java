import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das dimensões da planta da casa
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Leitura da planta da casa
        char[][] planta = new char[N][M];
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            planta[i] = linha.toCharArray();
        }

        // Pré-cálculo da matriz de espaços vazios consecutivos
        int[][] espacosVazios = calcularEspacosVazios(planta);

        // Leitura do número de opções de mesa
        int K = scanner.nextInt();

        // Inicialização das variáveis para armazenar a maior área e a mesa correspondente
        int maiorArea = 0;
        int melhorComprimento = 0;
        int melhorLargura = 0;

        // Verificação de cada opção de mesa
        for (int i = 0; i < K; i++) {
            int Ci = scanner.nextInt(); // Comprimento da mesa
            int Li = scanner.nextInt(); // Largura da mesa

            // Verificação da mesa na posição original
            int areaOriginal = verificarMesa(espacosVazios, Ci, Li);
            if (areaOriginal > maiorArea || (areaOriginal == maiorArea && Li > melhorLargura)) {
                maiorArea = areaOriginal;
                melhorComprimento = Ci;
                melhorLargura = Li;
            }

            // Verificação da mesa rotacionada
            int areaRotacionada = verificarMesa(espacosVazios, Li, Ci);
            if (areaRotacionada > maiorArea || (areaRotacionada == maiorArea && Ci > melhorLargura)) {
                maiorArea = areaRotacionada;
                melhorComprimento = Li;
                melhorLargura = Ci;
            }
        }

        // Imprimir as dimensões da mesa de maior área que cabe na casa de Isabel
        System.out.println(melhorLargura + " " + melhorComprimento);

        scanner.close();
    }

    // Função para pré-calcular a matriz de espaços vazios consecutivos
    private static int[][] calcularEspacosVazios(char[][] planta) {
        int N = planta.length;
        int M = planta[0].length;
        int[][] espacosVazios = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (planta[i][j] == '.') {
                    espacosVazios[i][j] = (j > 0) ? espacosVazios[i][j - 1] + 1 : 1;
                }
            }
        }

        return espacosVazios;
    }

    // Função otimizada para verificar se uma mesa cabe na planta da casa
    private static int verificarMesa(int[][] espacosVazios, int comprimento, int largura) {
        int N = espacosVazios.length;
        int M = espacosVazios[0].length;
        int count = 0;

        for (int i = 0; i <= N - comprimento; i++) {
            for (int j = 0; j <= M - largura; j++) {
                boolean mesaCabe = true;

                for (int k = 0; k < comprimento; k++) {
                    if (espacosVazios[i + k][j + largura - 1] < largura) {
                        mesaCabe = false;
                        break;
                    }
                }

                if (mesaCabe) {
                    count = Math.max(count, comprimento * largura);
                }
            }
        }

        return count;
    }

}