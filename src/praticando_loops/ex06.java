package praticando_loops;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tentativas = 3;
        int senhaCorreta = 1234;

        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            int senha = sc.nextInt();
            tentativas--;

            if (senha == senhaCorreta) {
                System.out.println("Senha Correta! Acesso Concedido!");
                break;
            } else {
                System.out.println("Senha incorreta. Você tem " + tentativas + " tentativas restante.");
            }

            if (tentativas == 0) {
                System.out.println("Conta bloqueada temporariamente");
            }
        }

        sc.close();
    }
}
