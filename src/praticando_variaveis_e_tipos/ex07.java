package praticando_variaveis_e_tipos;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        /*
        Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num =  sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }

        sc.close();
    }
}
