package listas_e_colecoes.lista_objetos_distintos.Exercicio04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);

        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }


    }
}
