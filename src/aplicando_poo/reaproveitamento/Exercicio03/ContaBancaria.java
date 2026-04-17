package aplicando_poo.reaproveitamento.Exercicio03;

public class ContaBancaria {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo || valor <= 0) {
            System.out.println("Não é possível realizar o saque");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido de depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
