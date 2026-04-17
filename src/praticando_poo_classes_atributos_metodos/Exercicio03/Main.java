package praticando_poo_classes_atributos_metodos.Exercicio03;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Conta c = new Conta();

        c.saldo = 1579.42;

        c.exibirSaldo();
        c.zerarSaldo();
        c.exibirSaldo();
    }

}
