package praticando_heranca_polimorfismo_interface.Exercicio04;

public class Push extends Notificacao {

    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: " + getDestinatario());
        System.out.println("Título: " + getTitulo());
        System.out.println("Conteúdo: " + getMensagem());
        System.out.println();
    }
}
