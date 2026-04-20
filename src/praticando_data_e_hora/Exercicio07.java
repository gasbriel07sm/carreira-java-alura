package praticando_data_e_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio07 {
    public static void main(String[] args) {

        LocalDate dataVencimento = LocalDate.of(2025,3,30);
        int periodoAntecedencia = 5;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataLembrete = dataVencimento.minusDays(periodoAntecedencia);

        System.out.println("Data do lembrete: " + dtf.format(dataLembrete));
    }
}
