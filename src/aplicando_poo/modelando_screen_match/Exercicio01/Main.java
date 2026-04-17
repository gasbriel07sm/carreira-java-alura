package aplicando_poo.modelando_screen_match.Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.print("Digite o nome: ");
        p1.nome = sc.nextLine();

        System.out.println(p1.saudacao());

        sc.close();
    }
}
