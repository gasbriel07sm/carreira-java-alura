package primeira_aplicacao.construindo_catalogo_filme;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano: " + anoDeLancamento);

        boolean incluidoNoPlano = true; // booleano somente possui o valor verdadeiro ou falso somente

        double notaDoFilme = 7.898;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String sinopse = """
                Filme: Top Gun
                Filme de Aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        // text block: """ """

        /* Convenção de código:
            camelCase - variáveis (anoFilme)
            PascalCase - classes (MainMenu)
         */

        int classificacao = (int) (media / 2); // casting explícito
        System.out.println(classificacao);
    }
}
