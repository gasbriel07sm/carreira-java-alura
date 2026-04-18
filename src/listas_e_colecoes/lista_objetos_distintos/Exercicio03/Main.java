package listas_e_colecoes.lista_objetos_distintos.Exercicio03;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        Produto p1 = new Produto("P1", 50.00);
        Produto p2 = new Produto("P2", 30.00);
        Produto p3 = new Produto("P3", 20.00);
        Produto p4 = new Produto("P4", 10.00);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);

        double somaProdutos = 0;

        for (Produto p : listaProdutos) {
            somaProdutos += p.getPreco();
        }

        double mediaPreco = somaProdutos/listaProdutos.size();
        System.out.printf("Média de preço: %.2f%n", mediaPreco);
    }
}
