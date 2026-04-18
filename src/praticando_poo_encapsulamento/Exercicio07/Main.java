package praticando_poo_encapsulamento.Exercicio07;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        double media = matrix.mediaAvaliacoes();
        System.out.printf("Média das avaliações: %.2f%n", media);
    }
}
