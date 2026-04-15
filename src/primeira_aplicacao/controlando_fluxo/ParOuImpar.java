package primeira_aplicacao.controlando_fluxo;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print("O número " + n + " é par");
        } else {
            System.out.print("O número " + n + " é ímpar");
        }

        sc.close();
    }
}
