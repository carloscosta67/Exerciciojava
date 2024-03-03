import java.util.Scanner;
public class Exercicio6 {
    public class ConversorFahrenheitCelsius {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura da temperatura em Fahrenheit
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            // Cálculo da temperatura em Celsius
            double celsius = (fahrenheit - 32) * 5 / 9;

            // Exibição da temperatura em Celsius
            System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius.\n", fahrenheit, celsius);

            // Teste de correção
            if (fahrenheit == 212) {
                if (celsius == 100) {
                    System.out.println("Teste de correção bem-sucedido!");
                } else {
                    System.out.println("Teste de correção falhou!");
                }
            }
        }
    }
}
