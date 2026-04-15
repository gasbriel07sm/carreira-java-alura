package primeira_aplicacao.primeiro_programa_java;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int subtracao = n1 - n2;

        System.out.println("A subtração entre os números " + n1 + " e " + n2 + " é igual a " + subtracao);

        sc.close();
    }
}
