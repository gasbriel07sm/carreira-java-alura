package primeira_aplicacao.construindo_catalogo_filme;

import java.util.Locale;
import java.util.Scanner;

public class PrecoTotal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço original do produto: ");
        double precoOriginal = sc.nextDouble();

        System.out.print("Percentual de desconto: ");
        double percentualDesconto = sc.nextDouble();

        double precoTotal = precoOriginal * (1 - (percentualDesconto / 100));

        System.out.printf("Preço total com desconto: R$ %.2f%n", precoTotal);

        sc.close();
    }
}
