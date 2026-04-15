package primeira_aplicacao.primeiro_programa_java;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + ", seja bem-vindo!");
        System.out.println("Tudo bem com você? ");

        sc.close();
    }
}
