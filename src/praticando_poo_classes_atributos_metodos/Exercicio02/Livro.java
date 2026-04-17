package praticando_poo_classes_atributos_metodos.Exercicio02;

public class Livro {

    String titulo;
    String autor;
    int paginas;

    void exibirInformacoes() {
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }
}
