package praticando_poo_classes_atributos_metodos.Exercicio04;

public class Temperatura {

    String local;
    double temperaturaAtual;

    void exibirDados() {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC%n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
