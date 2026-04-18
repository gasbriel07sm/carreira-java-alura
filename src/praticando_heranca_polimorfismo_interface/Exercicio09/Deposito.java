package praticando_heranca_polimorfismo_interface.Exercicio09;

public class Deposito extends OperacaoBancaria{

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$ %.2f realizado%n", getValor());
    }
}
