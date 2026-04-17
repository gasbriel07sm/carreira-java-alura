package praticando_poo_classes_atributos_metodos.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto p1 = new Produto();

        p1.nome = "Mouse Gamer";
        p1.preco = 159.9;
        p1.quantidade = 25;

        p1.exibirDados();
    }
}
