package ex1;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n| Cálculo de média ponderada");
        System.out.print("Primeiro valor: ");
        int primeiro = Integer.parseInt(scan.nextLine());
        System.out.print("Segundo valor: ");
        int segundo = Integer.parseInt(scan.nextLine());
        System.out.print("Terceiro valor: ");
        int terceiro = Integer.parseInt(scan.nextLine());
        System.out.print("Quarto valor: ");
        int quarto = Integer.parseInt(scan.nextLine());

        int valor2 = segundo * 2;
        int valor3 = terceiro * 3;
        int valor4 = quarto * 4;

        float somaTotal = primeiro + valor2 + valor3 + valor4;
        float mediaPonderada = somaTotal / 4;

        System.out.println("\nMedia ponderada: " + mediaPonderada);
    }
}
