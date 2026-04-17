package aplicando_poo.comportamentos_comuns.Exercicio04;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor =  new ConversorTemperaturaPadrao();

        double c = 45;
        double f = conversor.celsiusParaFahrenheit(c);
        System.out.printf("%.1f ºC é igual a: %.1f ºF%n", c, f);

        f = 115;
        c = conversor.fahrenheitParaCelsius(f);
        System.out.printf("%.1f ºF é igual a: %.1f ºC%n", f, c);

    }
}
