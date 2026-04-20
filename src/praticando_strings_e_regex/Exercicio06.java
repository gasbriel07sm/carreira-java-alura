package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);

        sc.close();
    }
}
