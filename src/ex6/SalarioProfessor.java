package ex6;

import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double horaAula, aulasPorMes, inss;

        System.out.println("\n| Calcular Salário Professor");
        System.out.print("Informe o valor da hora/aula: ");
        horaAula = Double.parseDouble(scan.nextLine());
        System.out.print("Informe o número de aulas por mês: ");
        aulasPorMes = Double.parseDouble(scan.nextLine());
        System.out.print("Informe o percentual de desconto INSS (apenas numero): ");
        inss = Double.parseDouble(scan.nextLine());

        double descontoInss = (aulasPorMes * horaAula) * (inss/100);
        double salario = (aulasPorMes * horaAula) - descontoInss;
        System.out.printf("Salário final: R$ %.2f\n", salario);

        scan.close();
    }
}
