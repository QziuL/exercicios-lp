package ex7;

import java.util.Scanner;

public class CalcularMinutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Calcular minutos que passaram");
        System.out.print("Informe um valor de hora: ");
        int hora = Integer.parseInt(scan.nextLine());

        if (hora < 0)
            System.out.println("Erro: hora negativa.");
        else {
            int minutos = hora * 60;
            System.out.printf("Se passaram %d minutos.\n", minutos);
        }

        scan.close();
    }
}
