package primeira_aplicacao.controlando_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU DE OPÇÕES ===");
        System.out.println("[1] Calcular a área do quadrado: ");
        System.out.println("[2] Cacular a área do círculo: ");
        System.out.println("[3] Sair");
        System.out.println("======================");

        int op = sc.nextInt();

        double area = 0;

        switch (op) {
            case 1:
                System.out.print("Qual o valor do lado? ");
                double lado = sc.nextDouble();

                area = Math.pow(lado, 2);
                System.out.printf("A área é igual a: %.2f%n", area);

                break;
            case 2:
                System.out.print("Valor do raio? ");
                double raio = sc.nextDouble();

                area = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área é igual a: %.2f m² %n", area);

                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
