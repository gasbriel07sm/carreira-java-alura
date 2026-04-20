package praticando_colecoes_e_streams.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Vitor");
        listaNomes.add("Ana");

        System.out.println("Lista de funcionários: " + listaNomes);
    }
}
