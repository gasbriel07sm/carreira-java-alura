package praticando_heranca_polimorfismo_interface.Exercicio09;

public abstract class OperacaoBancaria implements AcaoBancaria {

    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
