package aplicando_poo.comportamentos_comuns;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(1999);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());


        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("O poderoso cefinho");
        meuFilme2.setAnoDeLancamento(1970);
        meuFilme2.setDuracaoEmMinutos(480);

        Calculadora calc = new Calculadora();
        calc.inclui(meuFilme);
        calc.inclui(meuFilme2);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        sc.close();

        Recomendacao rec = new Recomendacao();
        rec.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(lost);
        ep.setTotalVisualizacao(300);
        rec.filtra(ep);

    }
}
