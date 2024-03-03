import java.util.Scanner;
public class Exercicio4 {
    public class CustoCarro {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura do custo de fábrica
            System.out.print("Digite o custo de fábrica do carro: R$ ");
            double custoFabrica = scanner.nextDouble();

            // Cálculo da porcentagem do distribuidor
            double porcentagemDistribuidor = 28.0;
            double valorDistribuidor = custoFabrica * (porcentagemDistribuidor / 100);

            // Cálculo da porcentagem de impostos
            double porcentagemImpostos = 45.0;
            double valorImpostos = custoFabrica * (porcentagemImpostos / 100);

            // Cálculo do custo final
            double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

            // Exibição do custo final
            System.out.printf("Custo final do carro: R$ %.2f\n", custoFinal);
        }
    }
}
