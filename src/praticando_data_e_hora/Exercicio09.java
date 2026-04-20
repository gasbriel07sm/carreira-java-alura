package praticando_data_e_hora;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio09 {
    public static void main(String[] args) {

//        ZonedDateTime horarioSistema = ZonedDateTime.now();
//        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        LocalTime horario = LocalTime.now();
        LocalTime horarioAus = LocalTime.now(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + dtf.format(horario));
        System.out.println("Horário atual em Sydney: "  + dtf.format(horarioAus));
    }
}
