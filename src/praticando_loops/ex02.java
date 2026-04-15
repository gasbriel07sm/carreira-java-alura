package praticando_loops;

public class ex02 {
    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50}; // declrando e inicializando um vetor
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        System.out.println("A soma total das receitas é: " + soma);
    }
}
