package praticando_colecoes_e_streams.Exercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o ID? ");
        int id = sc.nextInt();

        if (clientes.containsKey(id)) {
            System.out.printf("O nome do cliente com ID %d é: %s %n", id, clientes.get(id));
        } else {
            System.out.printf("O nome do cliente com ID %d não foi encontrado %n", id);
        }


        sc.close();
    }
}
