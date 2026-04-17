package praticando_poo_classes_atributos_metodos.Exercicio08;

public class Vendas {

    String nome;
    int quantidade;

    void vender(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente");
        } else {
            this.quantidade -=  quantidade;
            System.out.printf("Venda realizada. Estoque restante de Camiseta: %d%n", quantidade);
        }
    }
}
