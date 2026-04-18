package listas_e_colecoes.lista_objetos_distintos.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Cachorro animal1 = new Cachorro();

        if (animal1 instanceof Animal) {
            System.out.println("Animal");
        }
    }
}
