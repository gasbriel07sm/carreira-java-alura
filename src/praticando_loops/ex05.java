package praticando_loops;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os números separados por espaços: ");
        String[] numerosStr = sc.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
