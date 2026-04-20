package praticando_data_e_hora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        String tarefa = "Enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();
        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Hora de criação: " + horaCriacao);
    }
}
