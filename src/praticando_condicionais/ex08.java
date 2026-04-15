package praticando_condicionais;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        /*
        Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os
        lados podem formar um triângulo ou não.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();

        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();

        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();

        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Os lados não podem formar um triângulo");
        }

        sc.close();
    }
}
