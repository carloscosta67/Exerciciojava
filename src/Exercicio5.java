import java.util.Scanner;
public class Exercicio5 {
    public class SalarioVendedor {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            // Leitura dos dados
            System.out.print("Digite o número de carros vendidos: ");
            int carrosVendidos = entrada.nextInt();

            System.out.print("Digite o valor total de vendas: R$ ");
            double valorTotalVendas = entrada.nextDouble();

            System.out.print("Digite o salário fixo: R$ ");
            double salarioFixo = entrada.nextDouble();

            System.out.print("Digite a comissão por carro vendido: R$ ");
            double comissaoCarroVendido = entrada.nextDouble();

            // Cálculo da comissão total
            double comissaoTotal = carrosVendidos * comissaoCarroVendido;

            // Cálculo do bônus
            double bonus = valorTotalVendas * 0.05;

            // Cálculo do salário final
            double salarioFinal = salarioFixo + comissaoTotal + bonus;

            // Exibição do salário final
            System.out.printf("O salário final do vendedor é de R$ %.2f\n", salarioFinal);
        }
    }
}
