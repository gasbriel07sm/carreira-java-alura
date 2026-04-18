package listas_e_colecoes.ordenando_dados;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970); // instanciação do objeto
        meuFilme.setDuracaoEmMinutos(180);

        //  System.out.println(meuFilme); // imprime o local na memória

        meuFilme.exibeFichaTecnica(); // chamando o método

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie("Lost", 200);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());


        Filme meuFilme2 = new Filme("O poderoso chefinho", 1940);
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

        var filmePauulo = new Filme("Paulo", 1999);
        filmePauulo.setDuracaoEmMinutos(180);
        filmePauulo.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
        listaFilmes.add(filmePauulo);
        listaFilmes.add(meuFilme);
        listaFilmes.add(meuFilme2);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());

        for (Filme filme : listaFilmes) {
            System.out.println(filme.getNome());
        }

        ArrayList<String> buscaPorArtista =  new ArrayList<>();
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Rodrigo");
        buscaPorArtista.add("Antonio");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); // ordernar alfabeticamente
        System.out.println(buscaPorArtista);

        Collections.sort(listaFilmes); // ordernar alfabeticamente
        System.out.println(listaFilmes);

        listaFilmes.sort(Comparator.comparing((Titulo::getAnoDeLancamento)));


    }
}
