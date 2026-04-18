package listas_e_colecoes.lista_objetos_distintos;

public class Calculadora {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
