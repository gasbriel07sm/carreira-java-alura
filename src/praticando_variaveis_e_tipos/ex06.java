package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        /*
        Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria
        correspondente, conforme as seguintes regras:
        Econômico: preço até R$ 50,00.
        Intermediário: preço entre R$ 50,01 e R$ 200,00.
        Premium: preço acima de R$ 200,00. Exemplo de entrada:
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco <= 50 && preco >= 0) {
            System.out.println("Categoria: Econômico");
        } else if (preco > 50 && preco <= 200) {
            System.out.println("Categoria: Intermediário");
        } else if (preco > 200) {
            System.out.println("Categoria: Premium");
        }

        sc.close();
    }
}
