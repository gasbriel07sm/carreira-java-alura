package primeira_aplicacao.construindo_catalogo_filme;

import java.util.Locale;
import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dolares: ");
        double dolar = sc.nextDouble();

        // 1 dolar = 4.94 reais

        double reais = dolar * 4.94;

        System.out.printf("Você possui R$ %.2f %n", reais);

        sc.close();
    }
}
