package aplicando_poo.modelando_screen_match.Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro c =  new Carro();

        c.modelo = "Civic";
        c.cor = "Preto";
        c.ano = 2011;

        c.exibirFichaTecnica();
        System.out.println("Idade do carro: " + c.idadeCarro());
    }
}
