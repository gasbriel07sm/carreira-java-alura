package primeira_aplicacao.controlando_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.print("Qual o nao de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.print("Diga a sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitura.close();
    }
}
