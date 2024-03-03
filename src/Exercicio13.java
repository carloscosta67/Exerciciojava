import java.util.Scanner;
public class Exercicio13 {
      public class OrdenarCrescente {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Leitura dos valores
            System.out.print("Digite o primeiro valor: ");
            int a = scanner.nextInt();
            System.out.print("Digite o segundo valor: ");
            int b = scanner.nextInt();
            // Comparação e escrita dos valores em ordem crescente
            if (a < b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
