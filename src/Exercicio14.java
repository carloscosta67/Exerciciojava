import java.util.Scanner;
public class Exercicio14 {
    public class DuracaoXadrez {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Leitura da hora de início
            System.out.print("Digite a hora de início do jogo (0-23): ");
            int horaInicio = scanner.nextInt();
            // Leitura da hora de fim
            System.out.print("Digite a hora de fim do jogo (0-23): ");
            int horaFim = scanner.nextInt();
            // Verificação da validade das horas
            if (horaInicio < 0 || horaInicio > 23 || horaFim < 0 || horaFim > 23) {
                System.out.println("Hora inválida! Digite um valor entre 0 e 23.");
                return;
            }
            // Cálculo da duração do jogo
            int duracaoJogo;
            if (horaFim >= horaInicio) {
                duracaoJogo = horaFim - horaInicio;
            } else {
                duracaoJogo = 24 - horaInicio + horaFim;
            }
            // Exibição da duração do jogo
            System.out.println("A duração do jogo foi de " + duracaoJogo + " horas.");
        }

    } }
