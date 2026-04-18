package listas_e_colecoes.consolidando_conhecimento;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Compra> lista = new ArrayList<>();

        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();

        while (true) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            if (valor <= limite) {
                lista.add(new Compra(descricao, valor));
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                int op = sc.nextInt();

                if (op == 0) {
                    System.out.println("******************************");
                    System.out.println("COMPRAS REALIZADAS: ");
                    System.out.println();
                    lista.sort(Comparator.comparing(Compra::getValor));
                    for (Compra c : lista) {
                        System.out.println(c);
                    }
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.printf("Saldo do cartão: %.2f%n", limite);
                    break;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                System.out.println("******************************");
                System.out.println("COMPRAS REALIZADAS: ");
                System.out.println();
                lista.sort(Comparator.comparing(Compra::getValor));
                for (Compra c : lista) {
                    System.out.println(c);
                }
                System.out.println();
                System.out.println("*******************************");
                System.out.printf("Saldo do cartão: %.2f%n", limite);
                break;
            }
            limite -= valor;
        }

        sc.close();
    }
}
