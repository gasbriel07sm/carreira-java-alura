package listas_e_colecoes.ordenando_dados.Exercicio02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Titulo t0 = new Titulo("A");
        Titulo t1 = new Titulo("B");
        Titulo t2 = new Titulo("54");
        Titulo t3 = new Titulo("G");

        ArrayList<Titulo> lista = new ArrayList<Titulo>();

        lista.add(t0);
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);

        System.out.println("Sem ordernar: ");
        System.out.println(lista);

        Collections.sort(lista);

        System.out.println("Ordenados: ");
        System.out.println(lista);
    }
}
