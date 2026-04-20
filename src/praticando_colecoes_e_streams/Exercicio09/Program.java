package praticando_colecoes_e_streams.Exercicio09;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double total = precosProdutos.stream().reduce(0.0, Double::sum);
        double imposto = total * 0.08;
        double totalComImposto = total * imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", total));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));
    }
}
