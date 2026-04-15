package praticando_condicionais;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 =  sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 =  sc.nextInt();

        int maior = Math.max(n1, n2);

        if(n1 == n2) {
            System.out.println("Os dois números são iguais.");
        } else {
            System.out.println("O maior número é: " + maior);
        }

        sc.close();
    }
}
