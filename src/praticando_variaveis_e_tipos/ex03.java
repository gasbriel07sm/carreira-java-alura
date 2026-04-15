package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        /*
        Para resolver essa tarefa, você deve criar um programa que:
        Declare as variáveis nota1, nota2 e nota3
        Atribua os valores mencionados.
        Calcule a média das notas.
        Imprima o resultado na tela. Saída esperada:
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("A média das notas é: %.2f%n", media);

        sc.close();
    }
}
