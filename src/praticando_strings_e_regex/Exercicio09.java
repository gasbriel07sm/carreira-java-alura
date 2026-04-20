package praticando_strings_e_regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtags));
        }

        sc.close();
    }
}
