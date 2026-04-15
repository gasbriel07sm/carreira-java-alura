package praticando_variaveis_e_tipos;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double celsius = sc.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("%dºC equivale a %dºF %n", (int) celsius, (int) farenheit);

        sc.close();
    }
}
