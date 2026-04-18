package praticando_heranca_polimorfismo_interface.Exercicio03;

public class Revista extends Midia {

    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Revista: \"%s\" - Edicao; %s%n", getTitulo(), getEdicao());
    }
}
