package aplicando_poo.controlando_acesso;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Filme meuFilme = new Filme(); // instanciação do objeto

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        //  System.out.println(meuFilme); // imprime o local na memória

        meuFilme.exibeFichaTecnica(); // chamando o método

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        sc.close();
    }
}
