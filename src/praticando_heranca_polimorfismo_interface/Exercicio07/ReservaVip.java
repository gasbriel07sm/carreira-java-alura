package praticando_heranca_polimorfismo_interface.Exercicio07;

public class ReservaVip extends Reserva {

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
