package praticando_strings_e_regex;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }

        sc.close();
    }
}
