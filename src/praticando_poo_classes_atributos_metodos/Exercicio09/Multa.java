package praticando_poo_classes_atributos_metodos.Exercicio09;

public class Multa {

    String titulo;
    int diasAtraso;

    double valorMulta() {
        return (diasAtraso * 2.50);
    }

    void exibirDetalhes() {
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasAtraso, valorMulta());
    }

}
