package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nome = sc.nextLine();

        int posicaoPonto = nome.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = nome.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }

        sc.close();
    }
}
