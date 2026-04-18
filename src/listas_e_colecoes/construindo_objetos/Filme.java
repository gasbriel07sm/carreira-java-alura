package listas_e_colecoes.construindo_objetos;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome,  anoDeLancamento);
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2;
    }
}
