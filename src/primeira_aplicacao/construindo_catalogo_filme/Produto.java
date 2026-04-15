package primeira_aplicacao.construindo_catalogo_filme;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();

        System.out.print("Quantidade do produto: ");
        int qtd = sc.nextInt();

        double precoTotal = precoProduto * qtd;

        System.out.printf("Preço total: %.2f%n", precoTotal);

        sc.close();
    }
}
