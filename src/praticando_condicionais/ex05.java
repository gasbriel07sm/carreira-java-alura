package praticando_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        /*
        Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem
        informando se o desconto foi aplicado ou não.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de compra: ");
        double valorCompra = sc.nextDouble();

        double desconto = 0;

        if (valorCompra >= 100) {
            System.out.println("Desconto de 10% aplicado");
            desconto = 10;
        } else {
            System.out.println("Nenhum desconto aplicado");
        }

        double valorTotal = valorCompra * (1 - (desconto / 100));

        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
