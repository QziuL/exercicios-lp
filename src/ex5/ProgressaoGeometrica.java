package ex5;

import java.util.Scanner;

public class ProgressaoGeometrica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Progressão Geométrica");
        System.out.println("| Calcular o Quinto Termo");
        System.out.print("Informe a razão: ");
        double razao = Float.parseFloat(scan.nextLine());
        System.out.print("Informe o primeiro termo: ");
        double primeiroTermo = Float.parseFloat(scan.nextLine());

        double quintoTermo = primeiroTermo * (Math.pow(razao, 4));
        System.out.printf("Quinto termo: %.2f", quintoTermo);

        scan.close();
    }
}
