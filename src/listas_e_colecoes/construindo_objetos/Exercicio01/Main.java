package listas_e_colecoes.construindo_objetos.Exercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProduto =  new ArrayList<Produto>();

        Produto p1 = new Produto("Produto 1", 1950.50, 5);
        Produto p2 = new Produto("Produto 2", 5460.89, 1);
        Produto p3 = new Produto("Produto 3", 45.47, 3);
        Produto p4 = new Produto("Produto 4", 10564, 10);
        Produto p5 = new ProdutoPerecivel("Produto 5", 12.45, 5, "2026");

        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);
        listaProduto.add(p4);
        listaProduto.add(p5);

        System.out.println("Tamanho da lista: " + listaProduto.size());

        for (int i = 0; i < listaProduto.size(); i++) {
            System.out.println(i+1 + " - " + listaProduto.get(i).toString());
        }
    }
}
