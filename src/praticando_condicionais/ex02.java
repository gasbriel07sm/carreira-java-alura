package praticando_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        /*
        Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média: ");
        double media = sc.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
