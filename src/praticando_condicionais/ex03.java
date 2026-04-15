package praticando_condicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        String senhaCorreta = "123456";

        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        sc.close();
    }
}
