package praticando_poo_classes_atributos_metodos.Exercicio01;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public void exibirDados() {
        System.out.printf("""
                Produto: %s
                Preço: R$ %.2f
                Quantidade em estoque: %d
                """, nome, preco, quantidade);
    }
}
