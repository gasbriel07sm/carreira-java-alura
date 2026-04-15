package praticando_condicionais;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        /*
        Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem
        indicando se é um dia útil ou não.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String diaSemana = sc.nextLine().toLowerCase();

        if (diaSemana.equals("domingo") || diaSemana.equals("sábado")) {
            System.out.println("Não é dia útil");
        } else if (diaSemana.equals("segunda") || diaSemana.equals("terça") || diaSemana.equals("quarta") || diaSemana.equals("quinta") || diaSemana.equals("sexta")){
            System.out.println("É um dia útil");
        } else {
            System.out.println("Dia inválido");
        }

        sc.close();
    }
}
