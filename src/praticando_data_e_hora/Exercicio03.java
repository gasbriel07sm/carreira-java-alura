package praticando_data_e_hora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio03 {
    public static void main(String[] args) {

        LocalTime horaIn =  LocalTime.parse("14:30:00");
        LocalTime horaFin =  LocalTime.parse("16:45:00");

        Duration t1 = Duration.between(horaIn, horaFin);

        System.out.printf("Diferença de tempo: %s horas e %s minutos%n", t1.toHours(), t1.toMinutesPart() );
    }
}
