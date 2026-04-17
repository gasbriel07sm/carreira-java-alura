package aplicando_poo.consolidando_conhecimento;

public class Main {
    public static void main(String[] args) {

        Musicas m1 = new Musicas();
        m1.setTitulo("Forever");
        m1.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            m1.reproduz();
        }

        for (int i = 0; i < 5000; i++) {
            m1.curte();
        }

        Podcasts p1 = new Podcasts();
        p1.setTitulo("BolhaDev");
        p1.setHost("Marcus Mendes");

        for (int i = 0; i < 500; i++) {
            p1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            p1.curte();
        }

        MinhasPreferidas mp =  new MinhasPreferidas();
        mp.inclui(m1);
        mp.inclui(p1);

    }
}
