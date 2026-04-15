package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Consumo médio do veículo (km/L): ");
        double consumoMedio =  sc.nextDouble();

        System.out.print("Capacidade total do tanque de combustível (L): ");
        double capacidadeTotal =  sc.nextDouble();

        System.out.print("Quantidade de combustível disponível no momento (L): ");
        double qtdCombustivel =  sc.nextDouble();

        System.out.print("Distância da viagem planejada (km): ");
        double distancia =  sc.nextDouble();

        /*
        A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
        A autonomia atual, baseada na quantidade de combustível disponível.
        Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
        */

        double autonomiaMaxima = consumoMedio * capacidadeTotal;
        double autonomiaAtual = consumoMedio * qtdCombustivel;

        System.out.printf("Autonomia máxima do veículo: %.1f km %n",  autonomiaMaxima);
        System.out.printf("Autonomia atual do veículo: %.1f km %n",  autonomiaAtual);

        if (autonomiaAtual > autonomiaMaxima) {
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer");
        } else {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer. \n");
        }

        sc.close();
    }
}
