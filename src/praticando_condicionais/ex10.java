package praticando_condicionais;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoCorreto = 2023;
        int nivelPermissaoMax = 3;
        int nivelPermissaoMin = 1;

        System.out.print("Código de acesso: ");
        int codigoDigitado = sc.nextInt();

        System.out.println("Nível de permissão: ");
        int nivelPermissao = sc.nextInt();

        boolean codigoValido = codigoDigitado == codigoCorreto;
        boolean permissaoValido = nivelPermissao >= nivelPermissaoMax && nivelPermissao <= nivelPermissaoMin;

        if (codigoValido && permissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. \nMotivo:");
            if (!codigoValido) {
                System.out.println("- Código de acesso incorreto.");
            }
            if (!permissaoValido) {
                System.out.println("- Nível de permissão inválido.");
            }
        }
        sc.close();
    }
}
