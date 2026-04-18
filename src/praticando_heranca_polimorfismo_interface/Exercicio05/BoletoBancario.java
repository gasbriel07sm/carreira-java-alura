package praticando_heranca_polimorfismo_interface.Exercicio05;

public class BoletoBancario extends Pagamento {

    private final double TAXA = 5.00;

    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$ %.2f gerado com sucesso (Taxa: R$ %.2f)%n", getValor(), TAXA);
    }
}
