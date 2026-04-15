package praticando_condicionais;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        boolean idadeCompativel = idade >= 18 && idade <= 65;
        boolean pesoCompativel = peso > 50;

        if (idadeCompativel && pesoCompativel) {
            System.out.println("O doador é compatível");
        } else {
            System.out.println("O doador não é compatível. \nMotivo: ");
            if (!idadeCompativel) {
                System.out.println("- Deve ter entre 18 e 65 anos");
            }
            if (!pesoCompativel) {
                System.out.println("- Deve pesar mais de 50kg");
            }
        }

       sc.close();
    }
}
