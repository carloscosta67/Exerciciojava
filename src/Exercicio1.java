import java.util.Scanner;

    public class Exercicio1 { // Renamed class to Main

        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura da idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = entrada.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = entrada.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dias = entrada.nextInt();

        // Cálculo da idade total em dias
        int idadeTotalDias = anos * 365 + meses * 30 + dias;

        // Exibição da idade total em dias
        System.out.println("Idade total em dias: " + idadeTotalDias);
    }
}

