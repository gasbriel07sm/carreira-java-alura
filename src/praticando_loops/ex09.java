package praticando_loops;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 10 != 5) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
