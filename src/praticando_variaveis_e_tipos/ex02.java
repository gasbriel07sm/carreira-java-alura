package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        /*
        Para atender às exigências do sistema, crie um programa que converta a quantidade de double para int,
        garantindo que os valores sejam adequados ao formato aceito.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade do produto: ");
        double quantidade = sc.nextDouble();

        System.out.println("O valor inteiro do produto é: " + (int) quantidade);

        sc.close();
    }
}
