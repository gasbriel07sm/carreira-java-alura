package praticando_heranca_polimorfismo_interface.Exercicio03;

public class Ebook extends Midia {

    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Ebook: \"%s\" - Formato; %s%n", getTitulo(), getFormato());
    }
}
