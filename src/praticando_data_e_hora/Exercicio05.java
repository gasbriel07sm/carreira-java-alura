package praticando_data_e_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio05 {
    public static void main(String[] args) {

        LocalDate dataVencimento = LocalDate.of(2025, 03, 20);
        int meses = 1;
        LocalDate novaData = dataVencimento.plusMonths(meses);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Nova data de vencimento: " + novaData.format(dtf));
    }
}
