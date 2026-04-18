package praticando_poo_encapsulamento.Exercicio04;

public class Usuario {

    String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if (this.senha.equals(senha)) {
            System.out.println("Senha alterada com sucesso!");
            this.senha = novaSenha;
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
