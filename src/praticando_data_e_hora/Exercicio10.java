package praticando_data_e_hora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(sc.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = Integer.parseInt(sc.next());

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(sc.next(), formatter);
        LocalTime horarioPrevisto = entrada.plusHours(cargaHoraria);

        Duration t1 =  Duration.between(horarioPrevisto, saida);

        System.out.println("Horário de entrada " + formatter.format(entrada));
        System.out.println("Horário de saída previsto " + formatter.format(horarioPrevisto));
        System.out.println("Horário real de saida " + formatter.format(saida));

        if (t1.isNegative()) {
            System.out.printf("Saldo de horas: -%dh %dmin%n", t1.toHours(), t1.toMinutesPart());
        } else {
            System.out.printf("Saldo de horas: +%dh %dmin%n", t1.toHours(), t1.toMinutesPart());
        }

        sc.close();
    }
}
