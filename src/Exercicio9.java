import java.util.Scanner;
public class Exercicio9 {
    public class Maças {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número de maçãs compradas: ");
            int quantidade = scanner.nextInt();
            double precoTotal;
            if (quantidade < 12) {
                precoTotal = quantidade * 1.3;
            } else {
                precoTotal = quantidade * 1.0;
            }
            System.out.printf("O custo total da compra é de R$ %.2f\n", precoTotal);
        }
    }
}
