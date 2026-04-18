package listas_e_colecoes.ordenando_dados;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("O poderoso 2", 1950);
        Filme meuFilme = new Filme("O poderoso", 1978);
        Filme pauloFilme = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(pauloFilme);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo);

            if (titulo instanceof Filme filme && filme.getClassificacao() >= 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

    }
}
