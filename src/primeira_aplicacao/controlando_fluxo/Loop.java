package primeira_aplicacao.controlando_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a sua avaliação para o filme: ");
            nota = leitura.nextDouble();

            mediaAvaliacao +=  nota;
        }

        mediaAvaliacao /= 3;

        System.out.printf("Média das avaliações igual a %.2f%n", mediaAvaliacao);

        leitura.close();
    }
}
