package listas_e_colecoes.ordenando_dados.Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaNum = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            listaNum.add(num);
        }

        System.out.println("Sem ordenação numérica: ");

        for (Integer num : listaNum) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nCom ordenação numérica: ");
        Collections.sort(listaNum);

        for (Integer num : listaNum) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
