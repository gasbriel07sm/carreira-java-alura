package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante, utilizando
        os tipos apropriados,e depois exiba os valores armazenados.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("É estudante? (S / N): ");
        char op = sc.next().charAt(0);

        boolean estudante;

        if (op == 'S'){
            estudante = true;
        } else {
            estudante = false;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade " + idade);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.println("É estudante? " + estudante);

        sc.close();
    }
}
