package listas_e_colecoes.consolidando_conhecimento;

public class Compra implements Comparable<Compra> {

    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double saldo) {
        this.valor = saldo;
    }

    @Override
    public String toString() {
        return descricao + " - " + valor;
    }

    @Override
    public int compareTo(Compra o) {
        return 0;
    }
}
