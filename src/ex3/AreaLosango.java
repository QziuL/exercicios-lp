package ex3;

import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Calcular área de Losango");
        System.out.print("Diagonal Maior: ");
        double maior = Float.parseFloat(scan.nextLine());
        System.out.print("Diagonal Menor: ");
        double menor = Float.parseFloat(scan.nextLine());

        if (maior <= 0 || menor <= 0)
            System.out.println("Valor não deve ser negativo ou zero.");
        else {
            double area = (maior * menor) / 2;
            System.out.printf("A área do losango é %.2f\n", area);
        }

        scan.close();
    }
}