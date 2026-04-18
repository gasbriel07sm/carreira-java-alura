package praticando_poo_encapsulamento.Exercicio06;

public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual " + titular + ": " + String.format("%.2f", this.saldo));
    }
}
