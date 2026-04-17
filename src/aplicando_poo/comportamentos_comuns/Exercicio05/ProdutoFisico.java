package aplicando_poo.comportamentos_comuns.Exercicio05;

public class ProdutoFisico extends Produto implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
