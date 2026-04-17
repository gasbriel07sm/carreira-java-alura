package praticando_poo_classes_atributos_metodos.Exercicio10;

public class Carrinho {

    String nome;
    double preco;
    int quantidade;

    double valorTotal() {
        return preco * quantidade;
    }
}

