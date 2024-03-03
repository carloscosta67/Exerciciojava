
import java.util.Scanner;
public class Exercicio7 {
    public class MaiorQue10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ler um valor
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();

            // Verificar se o valor é maior que 10
            if (valor > 10) {
                // Escrever a mensagem "É MAIOR QUE 10!"
                System.out.println("É MAIOR QUE 10!");
            } else {
                // Escrever a mensagem "NÃO É MAIOR QUE 10!"
                System.out.println("NÃO É MAIOR QUE 10!");
            }
        }
    }
}
