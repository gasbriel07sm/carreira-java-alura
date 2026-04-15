package primeira_aplicacao.controlando_fluxo;

import java.util.Scanner;

public class CompararNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Os dois números são iguais");
        } else if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior que o " + n2);
        } else {
            System.out.println("O número " + n2 + " é maior que o " + n1);
        }

        sc.close();
    }
}
