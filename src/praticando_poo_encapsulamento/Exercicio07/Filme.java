package praticando_poo_encapsulamento.Exercicio07;

public class Filme {

    private String titulo;
    private int avaliacoes;
    private int totalAvaliacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.avaliacoes += nota;
            totalAvaliacoes++;
        }
    }

    public double mediaAvaliacoes() {
        return (double) avaliacoes / totalAvaliacoes;
    }
}
