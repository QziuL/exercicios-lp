package ex4;

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Progressão Aritmética");
        System.out.println("| Calcular Décimo Termo");
        System.out.print("Informe a razão: ");
        double razao = Double.parseDouble(scan.nextLine());
        System.out.print("Informe o primeiro termo: ");
        double termo = Double.parseDouble(scan.nextLine());

        double decimoTermo = termo + (9 * razao);
        System.out.printf("Décimo termo: %.2f", decimoTermo);

        scan.close();
    }
}
