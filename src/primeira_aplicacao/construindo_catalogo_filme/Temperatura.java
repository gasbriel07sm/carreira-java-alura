package primeira_aplicacao.construindo_catalogo_filme;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // definir casa decimais com ponto e não com vírgula
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em ºC: ");
        double c = sc.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.printf("A temperatura Celsius ºC %.1f em Fahrnheit é igual a ºF %.1f %n", c, f);
        // com casting
        System.out.printf("A temperatura Celsius ºC %d em Fahrnheit é igual a ºF %d %n", (int) c, (int) f);

        sc.close();
    }
}
