package praticando_condicionais;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        /*
        Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja
        criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }

        sc.close();
    }
}
