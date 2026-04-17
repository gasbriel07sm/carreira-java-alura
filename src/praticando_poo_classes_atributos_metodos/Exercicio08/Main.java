package praticando_poo_classes_atributos_metodos.Exercicio08;

public class Main {
    public static void main(String[] args) {

        Vendas v = new Vendas();

        v.nome = "Camiseta";
        v.quantidade = 10;

        v.vender(3);
        v.vender(8);

    }
}
