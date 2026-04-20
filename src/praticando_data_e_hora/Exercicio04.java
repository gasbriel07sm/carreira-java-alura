package praticando_data_e_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio04 {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2025,3, 15);
        LocalDate dataEntrega = data.plusDays(15);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: " + dataEntrega.format(dtf));
    }
}
