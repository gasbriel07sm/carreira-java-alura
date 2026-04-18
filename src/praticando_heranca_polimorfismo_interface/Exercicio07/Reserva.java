package praticando_heranca_polimorfismo_interface.Exercicio07;

public class Reserva {

    public void reservar() {
        System.out.println("Reserva realizada");
    }

    public void reservar(String data) {
        System.out.println("Reserca feita para o dia " + data);
    }

    public void reservar(String data, int quantidadePessoas) {
        System.out.printf("Reserva feita para o dia %s para %d pessoas%n", data, quantidadePessoas);
    }
}
