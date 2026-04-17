package praticando_poo_classes_atributos_metodos.Exercicio06;

public class Funcionario {

    String nome;
    String cargo;
    int nivelAcesso;

    void alterarInfo(String cargo, int nivelAcesso) {
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de acesso: " + nivelAcesso);
    }

}
