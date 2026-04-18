package praticando_heranca_polimorfismo_interface.Exercicio03;

public class Midia {

    private String titulo;
    private int anoPublicacao;
    private String codigo;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + getTitulo().substring(0, 3) + getAnoPublicacao();
    }

    public void exibirInfo() {
        System.out.printf("Código: %s | ", gerarCodigo());
    }
}
