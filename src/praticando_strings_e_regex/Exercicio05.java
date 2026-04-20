package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = sc.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra \"%s\" está presente no texto%n", palavra);
        } else {
            System.out.printf("A palavra \"%s\" não está presente no texto%n", palavra);
        }

        sc.close();
    }
}
