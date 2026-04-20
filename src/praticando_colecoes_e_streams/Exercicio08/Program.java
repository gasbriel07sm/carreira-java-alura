package praticando_colecoes_e_streams.Exercicio08;

import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadrados);
    }
}
