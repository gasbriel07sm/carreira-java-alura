package praticando_condicionais;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        /*
        Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo");
        }

        sc.close();
    }
}
