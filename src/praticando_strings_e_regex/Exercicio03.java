package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.print("Digite a plavra a ser substítuida: ");
        String palavra = sc.nextLine();

        if (!texto.contains(palavra)) {
            System.out.println("Palavra não encontrada.");
            return;
        }

        System.out.print("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();

        String textoModificado = texto.replace(palavra, novaPalavra );

        System.out.println("Texto modificado: " + textoModificado);

        sc.close();
    }
}
