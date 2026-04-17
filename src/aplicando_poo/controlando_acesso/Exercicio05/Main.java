package aplicando_poo.controlando_acesso.Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro l =  new Livro();

        System.out.print("Digite o nome do livro: ");
        l.setTitulo(sc.nextLine());

        System.out.print("Digiet o nome do autor do livro: ");
        l.setAutor(sc.nextLine());

        l.exibirDetalhes();

        sc.close();
    }
}
