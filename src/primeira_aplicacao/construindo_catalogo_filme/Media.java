package primeira_aplicacao.construindo_catalogo_filme;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2.0;

        System.out.printf("A média das notas %.2f e %.2f é igual a %.2f %n", n1, n2, media);

        sc.close();
    }
}
