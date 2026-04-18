package praticando_heranca_polimorfismo_interface.Exercicio03;

public class Livro extends Midia {

    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Livro: \"%s\" - Autor; %s%n", getTitulo(), getAutor());
    }
}
