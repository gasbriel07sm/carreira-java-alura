package praticando_loops;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdPos = 0;
        int qtdNeg = 0;
        String numStr = " ";

        while (!numStr.equals("fim")) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            numStr = sc.nextLine();

            if (numStr.equals("fim")) {
                break;
            } else {
                int num = Integer.parseInt(numStr);

                if (num < 0) {
                    qtdNeg++;
                } else {
                    qtdPos++;
                }
            }
        }

        System.out.println("Números positivos: "  + qtdPos);
        System.out.println("Números negativos: "  + qtdNeg);

        sc.close();
    }
}
