package aplicando_poo.controlando_acesso.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno a =  new Aluno();

        System.out.print("Digite o nome do aluno: ");
        a.setNome(sc.next());

        System.out.print("Digite a primeira nota do aluno: ");
        a.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota do aluno: ");
        a.setNota2(sc.nextDouble());

        double media = a.media();

        System.out.printf("Média = %.2f%n", media);

        sc.close();
    }
}
