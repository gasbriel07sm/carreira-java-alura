package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o título: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor: ");
        String autor = sc.nextLine();

        System.out.print("Digite o número de páginas: ");
        int numPaginas = sc.nextInt();

        System.out.print("Digite o preço do livro: ");
        double precoLivro = sc.nextDouble();

        System.out.print("""
                Escolha a categoria:
                F - Ficção
                N - Não-ficção
                T - Tecnologia
                H - História
                """);
        char op = sc.next().charAt(0);
        String categoria = " ";

        switch (op) {
            case 'F':
                categoria = "Ficção";
                break;
            case 'N':
                categoria = "Não-ficção";
                break;
            case 'T':
                categoria = "Tecnologia";
                break;
            case 'H':
                categoria = "História";
                break;
        }

        System.out.printf("Livro cadastrado: %s, de %s. Ele possui %d páginas, custa R$ %.2f e pertence à categoria %s ", titulo, autor, numPaginas, precoLivro, categoria);

        sc.close();
    }
}
