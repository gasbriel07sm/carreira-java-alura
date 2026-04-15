package primeira_aplicacao.consolidando_conhecimento;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 2500.00;
        System.out.printf("""
                        ****************************************************
                        Dados iniciais do cliente:
                        
                        Nome:             Gabriel de Souza Miranda
                        Tipo de conta:    Corrente
                        Saldo inicial:    R$ %.2f%n
                        ****************************************************
                        """, saldo);

        int op = 0;

        while (op != 4) {
            System.out.print("""
                    Operações
                    
                    [1] - Consultar Saldo
                    [2] - Retirar Valor
                    [3] - Depositar Valor
                    [4] - Sair
                    
                    Digite a opção desejada
                    """);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("O saldo atual é R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja retirar: ");
                    double valor = sc.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Não é possível retirar mais do que o saldo atual.");
                        System.out.println("Favor tentar novamente.");
                    } else if (valor < 0) {
                        System.out.println("Não é possível retirar valor negativo.");
                        System.out.println("Favor tentar novamente.");
                    } else {
                        saldo -= valor;
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor que deseja depositar: ");
                    valor = sc.nextDouble();

                    if (valor < 0) {
                        System.out.println("Não é possível depositar valor negativo.");
                        System.out.println("Favor tentar novamente.");
                    } else {
                        saldo += valor;
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("Favor tentar novamente.");
                    break;
            }
            System.out.println();
        }

        sc.close();
    }
}
