package listas_e_colecoes.lista_objetos_distintos.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("[%d] - Digite uma String: ", i);
            String palavra = sc.nextLine();

            lista.add(palavra);
        }

        for (String palavra : lista) {
            System.out.println(palavra);
        }

        sc.close();
    }
}
