import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double valorHora, salario;
            int horasTrabalhadas;

            System.out.print("Digite o valor que você ganha por hora: ");
            valorHora = scanner.nextDouble();

            System.out.print("Digite o número de horas trabalhadas no mês: ");
            horasTrabalhadas = scanner.nextInt();

            salario = valorHora * horasTrabalhadas;
        }
        System.out.printf("Seu salário neste mês é de R$ %.2f", salario);


    }
}