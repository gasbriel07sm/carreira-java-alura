package praticando_poo_classes_atributos_metodos.Exercicio05;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Aluno a =  new Aluno();

        a.nome = "João Silva";
        a.nota1 = 6.5;
        a.nota2 = 7.5;

        a.exibirDados();
    }
}
