package aplicando_poo.modelando_screen_match.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.print("Digite um número: ");
        calc.num = sc.nextInt();

        System.out.println(calc.dobro());

        sc.close();
    }
}
