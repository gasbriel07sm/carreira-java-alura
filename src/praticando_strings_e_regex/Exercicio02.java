package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Texto em maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());

        sc.close();
    }
}
