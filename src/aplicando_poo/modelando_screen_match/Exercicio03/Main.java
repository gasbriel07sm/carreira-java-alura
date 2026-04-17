package aplicando_poo.modelando_screen_match.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Musica mus = new Musica();

        mus.titulo = "Aleatório";
        mus.artista = "Beatles";
        mus.anoLancamento = 2020;
        mus.avaliarMusica(5);
        mus.avaliarMusica(4);
        mus.avaliarMusica(2);

        mus.exibirFichaTecnica();
        System.out.println("Média das avaliações: " + mus.media());

    }
}
