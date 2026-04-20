package praticando_data_e_hora;

import javax.swing.text.DateFormatter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio06 {
    public static void main(String[] args) {

        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.of(2025,3,9);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + dtf.format(dataEvento));
        System.out.println("Data atual: " + dtf.format(dataAtual));

//        Duration diferenca = Duration.between(dataEvento.atStartOfDay(), dataAtual.atStartOfDay());
//
//        if (diferenca.toDays() > 0){
//            System.out.println("O evento já ocorreu");
//        } else {
//            System.out.println("O evento ainda não ocorreu");
//        }

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }
    }
}
