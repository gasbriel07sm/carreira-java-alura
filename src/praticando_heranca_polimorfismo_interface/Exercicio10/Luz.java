package praticando_heranca_polimorfismo_interface.Exercicio10;

public class Luz implements Controlavel {

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
            System.out.println("Luz ligada");
            ligado = true;
        } else {
            System.out.println("Luz já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (!ligado) {
            System.out.println("Luz já está desligada");
        } else {
            System.out.println("Luz desligada");
            ligado = false;
        }
    }
}
