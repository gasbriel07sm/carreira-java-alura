package primeira_aplicacao.controlando_fluxo;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAleatorio = new Random().nextInt(100);
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            tentativas--;

            if (num < numAleatorio) {
                System.out.println("O número aleatório é maior que " + num);
            } else if (num > numAleatorio) {
                System.out.println("O número aleatório é menor que " + num);
            } else {
                System.out.println("Acertou o número. Parabéns!!");
                System.out.println("Quantidade de tentativas: " + tentativas);
                break;
            }

            System.out.println("Tentativas: " + tentativas);
        }

        sc.close();
    }
}
