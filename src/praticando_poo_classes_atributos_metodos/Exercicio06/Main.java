package praticando_poo_classes_atributos_metodos.Exercicio06;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome = "Júlia Oliveira";
        f1.cargo = "Pessoa Desenvolvedora Júnior";
        f1.nivelAcesso = 1;

        System.out.println("\nAntes da atualização: ");
        f1.exibirDados();

        System.out.println("\nApós a atualização: ");
        f1.alterarInfo("Pessoa Desenvolvedora Plena", 2);
        f1.exibirDados();
    }
}
