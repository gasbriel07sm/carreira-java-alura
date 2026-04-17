package praticando_poo_classes_atributos_metodos.Exercicio09;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Multa m = new Multa();

        m.titulo = "Dom Casmurro";
        m.diasAtraso = 3;

        m.exibirDetalhes();
    }
}
