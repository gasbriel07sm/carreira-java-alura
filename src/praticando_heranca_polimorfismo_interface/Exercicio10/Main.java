package praticando_heranca_polimorfismo_interface.Exercicio10;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
