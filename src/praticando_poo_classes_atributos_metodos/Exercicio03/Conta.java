package praticando_poo_classes_atributos_metodos.Exercicio03;

public class Conta {

    double saldo;

    void zerarSaldo() {
        saldo = 0.0;
    }

    void exibirSaldo() {
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
