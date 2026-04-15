package primeira_aplicacao.controlando_fluxo;

import java.util.Scanner;

public class IdentificacaoNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("O número " + num + " é positivo");
        } else {
            System.out.println("O número " + num + " é negativo");
        }

        sc.close();
    }
}
