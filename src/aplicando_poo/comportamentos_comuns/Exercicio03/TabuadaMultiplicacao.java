package aplicando_poo.comportamentos_comuns.Exercicio03;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, n, i * n);
        }
    }
}
