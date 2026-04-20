package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine().trim();

        System.out.println("Nome sem espaços: " + nome);

        sc.close();
    }
}
