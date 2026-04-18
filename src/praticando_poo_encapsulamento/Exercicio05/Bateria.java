package praticando_poo_encapsulamento.Exercicio05;

public class Bateria {

    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;

            if (nivelBateria <= 20){
                System.out.println("Bateria fraca");
            } else if (nivelBateria > 20 && nivelBateria < 80) {
                System.out.println("Bateria OK");
            } else {
                System.out.println("Bateria cheia");
            }
        }
    }
}
