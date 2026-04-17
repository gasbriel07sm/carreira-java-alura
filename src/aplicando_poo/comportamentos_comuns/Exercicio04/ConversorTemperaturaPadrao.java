package aplicando_poo.comportamentos_comuns.Exercicio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double c) {
        double f = (c * 1.8) + 32;
        return f;
    }

    @Override
    public double fahrenheitParaCelsius(double f) {
        double c = (f - 32) / 1.8;
        return c;
    }
}
