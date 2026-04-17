package aplicando_poo.comportamentos_comuns.Exercicio05;

public class Livro extends Produto implements Calculavel {

    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
