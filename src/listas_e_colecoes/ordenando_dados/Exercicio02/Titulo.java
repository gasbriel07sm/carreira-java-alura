package listas_e_colecoes.ordenando_dados.Exercicio02;

public class Titulo implements Comparable{

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Object outroObjeto) {
        return this.getNome().compareTo(((Titulo) outroObjeto).getNome());
    }

    @Override
    public String toString() {
        return "Nome = " + nome;
    }
}
