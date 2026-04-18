package praticando_poo_encapsulamento.Exercicio02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Agenda> contatos =  new ArrayList<Agenda>();

        contatos.add(new Agenda("João Silva", "(11) 99999-0000"));
        contatos.add(new Agenda("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Agenda("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;

        for (Agenda a : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    a.getNome(),
                    a.getTelefone());
        }
    }
}
