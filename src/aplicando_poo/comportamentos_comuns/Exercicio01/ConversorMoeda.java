package aplicando_poo.comportamentos_comuns.Exercicio01;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.99;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
