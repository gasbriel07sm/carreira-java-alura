package listas_e_colecoes.lista_objetos_distintos.Exercicio05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> cb = new ArrayList<>();

        ContaBancaria cb1 = new ContaBancaria(1, 1500);
        ContaBancaria cb2 = new ContaBancaria(2, 3500);
        ContaBancaria cb3 = new ContaBancaria(3, 4568);
        ContaBancaria cb4 = new ContaBancaria(4, 7894);

        cb.add(cb1);
        cb.add(cb2);
        cb.add(cb3);
        cb.add(cb4);

        double maiorSaldo = Double.MIN_VALUE;

        for (ContaBancaria conta : cb) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo);
    }
}
