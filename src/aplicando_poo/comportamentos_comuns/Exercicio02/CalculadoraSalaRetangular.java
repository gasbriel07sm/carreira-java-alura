package aplicando_poo.comportamentos_comuns.Exercicio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.printf("ÁREA = %.2f%n", area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.printf("PERÍMETRO = %.2f%n", perimetro);
    }
}
