package ex2;

import java.util.Scanner;

public class InverterCDU {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Inverter CDU");
        System.out.print("Entre com uma centena (ex: 360): ");
        int valorDigitado = Integer.parseInt(scan.nextLine());

        if (valorDigitado < 100) System.out.println("Erro: valor inválido.");
        else {
            int centena = valorDigitado / 100;
            int dezena = (valorDigitado % 100) / 10;
            int unidade = valorDigitado % 10;

            System.out.printf("%d%d%d", unidade, dezena, centena);
        }

        scan.close();
    }
}
