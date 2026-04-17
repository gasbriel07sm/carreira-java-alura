package aplicando_poo.controlando_acesso.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IdadePessoa ip = new IdadePessoa();

        System.out.print("Digite seu nome: ");
        ip.setName(sc.nextLine());

        System.out.print("Digite sua idade: ");
        ip.setIdade(sc.nextInt());

        System.out.println("Nome: " + ip.getName());
        System.out.println("Idade: " + ip.getIdade());
        ip.maiorIdade();

        sc.close();
    }
}
