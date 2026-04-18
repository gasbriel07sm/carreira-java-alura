package praticando_poo_encapsulamento.Exercicio09;

public class Alunos {

    private String nome;
    private int pontos;
    private int nivel;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;

        this.nivel = (pontos / 100) + 1;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontos: " + this.pontos);
        System.out.println("Nivel: " + this.nivel);
    }
}
