import java.util.Scanner;

    public class Exercicio2 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            // Leitura do total de eleitores
            System.out.print("Digite o total de eleitores: ");
            int totalEleitores = entrada.nextInt();

            // Leitura do número de votos brancos, nulos e válidos
            System.out.print("Digite o número de votos brancos: ");
            int votosBrancos = entrada.nextInt();
            System.out.print("Digite o número de votos nulos: ");
            int votosNulos = entrada.nextInt();
            System.out.print("Digite o número de votos válidos: ");
            int votosValidos = entrada.nextInt();

            // Cálculo dos percentuais
            double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percentualNulos = (votosNulos * 100.0) / totalEleitores;
            double percentualValidos = (votosValidos * 100.0) / totalEleitores;

            // Exibição dos resultados
            System.out.println("Percentual de votos brancos: " + String.format("%.2f", percentualBrancos) + "%");
            System.out.println("Percentual de votos nulos: " + String.format("%.2f", percentualNulos) + "%");
            System.out.println("Percentual de votos válidos: " + String.format("%.2f", percentualValidos) + "%");
        }
    }


