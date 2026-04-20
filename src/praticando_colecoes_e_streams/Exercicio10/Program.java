package praticando_colecoes_e_streams.Exercicio10;

import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas =  notas.stream().reduce(0.0, Double::sum);
        double media = somaNotas / notas.size();
        double maiorNota = notas.stream().max(Double::compareTo).get();
        double menorNota = notas.stream().min(Double::compareTo).get();

        System.out.printf("Média das notas é: %.2f%n", media);
        System.out.printf("Meno nota é: %.2f%n", menorNota);
        System.out.printf("Maior nota é: %.2f%n", maiorNota);

    }
}
