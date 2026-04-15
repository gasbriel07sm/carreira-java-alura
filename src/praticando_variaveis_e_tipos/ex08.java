package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        /*
        Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade em reais que você possui: ");
        double valorReais = sc.nextDouble();

        // taxa de câmbio 5.25 para cada 1 U$

        double dolar = valorReais / 5.25;

        System.out.printf("O valor em dólares é: US$ %.2f%n", dolar);

        sc.close();
    }
}
