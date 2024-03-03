import java.util.Scanner;
public class Exercicio8 {
    public class PositivoNegativo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero >= 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else {
                System.out.println("O número " + numero + " é negativo.");
            }
        }
    }
}
