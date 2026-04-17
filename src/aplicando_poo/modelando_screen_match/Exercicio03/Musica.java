package aplicando_poo.modelando_screen_match.Exercicio03;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double notaAvaliacao;
    int totalAvaliacao;

    void exibirFichaTecnica() {
        System.out.printf("""
                Título: %s
                Artista: %s
                Ano de Lancamento: %d
                Nota de Avaliações: %.2f
                Total de Avaliações: %d
                """, titulo, artista, anoLancamento, notaAvaliacao, totalAvaliacao);
    }

    void avaliarMusica(double notaAvaliacao) {
        this.notaAvaliacao += notaAvaliacao;
        totalAvaliacao++;
    }

    double media() {
        return notaAvaliacao / totalAvaliacao;
    }
}
