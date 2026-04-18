package listas_e_colecoes.ordenando_dados.Exercicio03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaNum = new ArrayList<>();
        List<Integer> listaDados = new LinkedList<>();

        listaNum.add(1);
        listaNum.add(2);
        listaNum.add(3);
        listaDados.add(1);
        listaDados.add(2);
        listaDados.add(3);

        System.out.println(listaNum);
        System.out.println(listaDados);
    }
}
