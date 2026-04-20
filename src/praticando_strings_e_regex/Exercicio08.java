package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }


        sc.close();
    }
}
