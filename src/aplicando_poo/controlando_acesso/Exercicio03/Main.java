package aplicando_poo.controlando_acesso.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Nome do produto: ");
        p.setNome(sc.next());

        System.out.print("Preço do produto: ");
        p.setPreco(sc.nextDouble());

        System.out.print("Desconto a ser aplicado: ");
        p.aplicarDesconto(sc.nextDouble());

        System.out.println("Preço total com desconto: " + p.getPreco());

        sc.close();
    }
}
