package praticando_poo_classes_atributos_metodos.Exercicio10;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ArrayList<Carrinho> carrinho = new ArrayList<Carrinho>();

        Carrinho c1 =  new Carrinho();
        Carrinho c2 =  new Carrinho();

        c1.nome = "Teclado";
        c1.preco = 120.0;
        c1.quantidade = 1;
        carrinho.add(c1);

        c2.nome = "Mouse";
        c2.preco = 60.0;
        c2.quantidade = 2;
        carrinho.add(c2);

        double somaTotal = 0;
        for (Carrinho c : carrinho) {
            somaTotal += c.valorTotal();
        }

        System.out.printf("Total da compra: R$ %.2f%n", somaTotal);
    }
}
