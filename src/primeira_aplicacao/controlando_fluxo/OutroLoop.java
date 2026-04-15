package primeira_aplicacao.controlando_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner leitura = new Scanner(System.in);

            double mediaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0;

            while (nota != -1) {
                System.out.print("Digite a sua avaliação para o  ou -1 para encerrar: ");
                nota = leitura.nextDouble();

                if (nota != -1) {
                    totalDeNotas++;
                    mediaAvaliacao +=  nota;
                }
            }

            mediaAvaliacao /= totalDeNotas;

            System.out.printf("Média das avaliações igual a %.2f%n", mediaAvaliacao);

            leitura.close();

    }
}
