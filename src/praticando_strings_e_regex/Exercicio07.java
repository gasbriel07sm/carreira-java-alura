package praticando_strings_e_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        String cod =  sc.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(cod);

        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência é inválido.");
        }

        sc.close();
    }
}
