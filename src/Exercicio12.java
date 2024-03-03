import java.util.Scanner;
public class Exercicio12 {
    public class MaiorDeDoisNumeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            int maior;
            if (num1 > num2) {
                maior = num1;
            } else {
                maior = num2;
            }
            System.out.println("O maior número é: " + maior);
        }
    }
}
