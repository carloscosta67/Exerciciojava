public class Exercicio15 {
    public class CalculoSalario {
        public static void main(String[] args) {
            // Definição das variáveis
            int horasTrabalhadasMes = 180; // Insira o número de horas trabalhadas no mês
            double salarioHora = 20.00; // Insira o valor do salário por hora
            int horasSemanais = 40; // Jornada de trabalho semanal
            double adicionalHoraExtra = 0.50; // Percentual de adicional por hora extra
            // Cálculo das horas extras
            int horasExtras = horasTrabalhadasMes - (horasSemanais * 4);
            if (horasExtras < 0) {
                horasExtras = 0;
            }
            // Cálculo do valor das horas extras
            double valorHoraExtra = salarioHora * (1 + adicionalHoraExtra);
            double valorHorasExtras = horasExtras * valorHoraExtra;
            // Cálculo do valor das horas normais
            double valorHorasNormais = (horasTrabalhadasMes - horasExtras) * salarioHora;
            // Cálculo do salário total
            double salarioTotal = valorHorasNormais + valorHorasExtras;
            // Exibição dos resultados
            System.out.println("Horas trabalhadas no mês: " + horasTrabalhadasMes);
            System.out.println("Salário por hora: R$" + salarioHora);
            System.out.println("Horas extras: " + horasExtras);
            System.out.println("Valor hora extra: R$" + valorHoraExtra);
            System.out.println("Valor horas normais: R$" + valorHorasNormais);
            System.out.println("Salário total: R$" + salarioTotal);
        }
    }
}
