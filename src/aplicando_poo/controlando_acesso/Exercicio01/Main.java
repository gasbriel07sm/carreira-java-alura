package aplicando_poo.controlando_acesso.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria cb = new ContaBancaria();

        System.out.print("Titular: ");
        cb.setTitular(sc.next());

        System.out.print("Número da conta: ");
        cb.setNumeroConta(sc.nextInt());

        System.out.print("Saldo: ");
        cb.setSaldo(sc.nextDouble());

        System.out.println("Titular: " + cb.getTitular());
        System.out.println("Número da conta: " + cb.getNumeroConta());
        System.out.println("Saldo: " + cb.getSaldo());

        sc.close();
    }
}
