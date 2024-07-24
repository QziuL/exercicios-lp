package ex4;

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Progressão Aritmética");
        System.out.println("| Calcular Décimo Termo");
        System.out.print("Informe a razão: ");
        double razao = Float.parseFloat(scan.nextLine());
        System.out.print("Informe o primeiro termo: ");
        double termo = Float.parseFloat(scan.nextLine());

        double decimoTermo = 2 + (10 - 1) * razao;
        System.out.printf("Décimo termo: %.2f", decimoTermo);

        scan.close();
    }
}
