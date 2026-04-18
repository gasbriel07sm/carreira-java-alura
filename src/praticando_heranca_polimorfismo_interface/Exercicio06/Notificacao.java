package praticando_heranca_polimorfismo_interface.Exercicio06;

public class Notificacao {
    public void enviarMensagem (String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem (String nome, String mensagem) {
        System.out.println("Mensagem enviada para " + nome + ": " + mensagem);
    }

    public void enviarMensagem (String nome, String mensagem, int quantidade) {
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Mensagem enviada para " + nome + ": " + mensagem);
        }
    }
}
