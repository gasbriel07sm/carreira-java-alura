package praticando_poo_encapsulamento.Exercicio03;

public class Sistema {

    private String nome;
    private double preco;

    public Sistema(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido.");
        } else {
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                "\nPreço: " + String.format("%.2f", preco);
    }
}
