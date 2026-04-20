package praticando_colecoes_e_streams.Exercicio05;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<Integer, String> cliente = new HashMap<>();

        cliente.put(1, "Maria");
        cliente.put(2, "Marcos");
        cliente.put(3, "Joao");

        System.out.println("O nome do cliente com ID 2 é: " + cliente.get(2));
    }
}
