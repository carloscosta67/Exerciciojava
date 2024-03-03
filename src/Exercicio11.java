import java.util.Scanner;
public class Exercicio11 {
    public class VerificaVoto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Leitura do ano atual
            System.out.println("Digite o ano atual: ");
            int anoAtual = scanner.nextInt();
            // Leitura do ano de nascimento
            System.out.println("Digite o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();
            // Cálculo da idade
            int idade = anoAtual - anoNascimento;
            // Verificação da idade para votar
            if (idade >= 16) {
                System.out.println("Você pode votar este ano!");
            } else {
                System.out.println("Você não pode votar este ano. Você tem " + idade + " anos.");
            }
        }
    }
}
