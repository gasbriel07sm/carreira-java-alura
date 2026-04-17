package aplicando_poo.reaproveitamento.Exercicio01;

public class Main {
    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();

    }
}
