package aplicando_poo.consolidando_conhecimento;

public class MinhasPreferidas {

    public void inclui(Audio a) {
        if (a.getClassificacao() >= 8) {
            System.out.println(a.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(a.getTitulo() + " é uma que todos estão curtindo");
        }
    }
}
