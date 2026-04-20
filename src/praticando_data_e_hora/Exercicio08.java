package praticando_data_e_hora;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio08 {
    public static void main(String[] args) {

        LocalTime japao = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Horário atual em Tóquio: " + dtf.format(japao));
    }
}
