package praticando_poo_classes_atributos_metodos.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Livro l = new Livro();

        l.titulo = "O Guia do Mochileiro das Galáxias";
        l.autor = "Douglas Adams";
        l.paginas = 208;

        l.exibirInformacoes();
    }
}
