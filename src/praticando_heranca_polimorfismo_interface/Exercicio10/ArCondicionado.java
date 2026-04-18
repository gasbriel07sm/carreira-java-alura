package praticando_heranca_polimorfismo_interface.Exercicio10;

public class ArCondicionado implements Controlavel {

    private boolean ligado = false;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Ar-condicionado ligado");
            ligado = true;
        } else {
            System.out.println("Ar-condicionado já está ligado");
        }
    }

    @Override
    public void desligar() {
        if (!ligado) {
            System.out.println("Ar-condicionado já está desligado");
        } else {
            System.out.println("Ar-condicionado desligado");
            ligado = false;
        }
    }
}
