import java.util.Scanner;
public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leitura do salário atual
        System.out.print("Digite o salário mensal atual: R$ ");
        double salarioAtual = scanner.nextDouble();
        // Leitura do percentual de reajuste
        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();
        // Cálculo do valor do reajuste
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
        // Cálculo do novo salário
        double novoSalario = salarioAtual + valorReajuste;
        // Exibição do valor do novo salário
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
    }
}