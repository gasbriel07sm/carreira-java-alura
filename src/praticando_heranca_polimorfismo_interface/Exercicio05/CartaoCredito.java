package praticando_heranca_polimorfismo_interface.Exercicio05;

public class CartaoCredito extends Pagamento {


    private final double TAXA = 7.50;

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$ %.2f confirmado no Cartão de Crédito (Taxa: R$ %.2f)%n", getValor(), TAXA);
    }
}
