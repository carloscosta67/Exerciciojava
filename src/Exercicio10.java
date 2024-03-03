import java.util.Scanner;
public class Exercicio10 {
    public class MediaAluno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Leitura das notas
            System.out.print("Digite a nota da 1ª avaliação: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a nota da 2ª avaliação: ");
            double nota2 = scanner.nextDouble();
            // Cálculo da média
            double media = (nota1 + nota2) / 2;
            // Verificação da aprovação
            String situacao;
            if (media >= 6) {
                situacao = "aprovado";
            } else {
                situacao = "reprovado";
            }
            // Exibição da mensagem final
            System.out.printf("Média: %.2f\n", media);
            System.out.println("Situação: " + situacao);
        }
    }
}
