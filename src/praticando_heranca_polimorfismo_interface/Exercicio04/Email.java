package praticando_heranca_polimorfismo_interface.Exercicio04;

public class Email extends Notificacao {

    private String assunto;

    public Email(String destinatario, String mensagem,  String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email para: " + getDestinatario());
        System.out.println("Assunto: " + getAssunto());
        System.out.println("Corpo: " + getMensagem());
        System.out.println();
    }
}
