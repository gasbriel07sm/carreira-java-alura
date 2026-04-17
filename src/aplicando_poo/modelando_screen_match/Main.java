package aplicando_poo.modelando_screen_match;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Filme meuFilme = new Filme(); // instanciação do objeto

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        //  System.out.println(meuFilme); // imprime o local na memória

        meuFilme.exibeFichaTecnica(); // chamando o método

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.mediaAvaliacoes());

        sc.close();
    }
}
