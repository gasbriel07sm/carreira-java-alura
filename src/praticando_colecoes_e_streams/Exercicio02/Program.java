package praticando_colecoes_e_streams.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Joana");
        listaNomes.add("Lucas");
        listaNomes.add("Pedro");
        listaNomes.add("Antônio");

        System.out.println("Lista inicial: " + listaNomes);

        listaNomes.remove("Pedro");

        System.out.println("Lista após a exclusão: " + listaNomes);
    }
}
