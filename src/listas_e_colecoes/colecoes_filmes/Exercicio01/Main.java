package listas_e_colecoes.colecoes_filmes.Exercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa("Gabriel", 18);
        Pessoa p2 = new Pessoa("Luiz", 54);
        Pessoa p3 = new Pessoa("Douglas", 20);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("LISTA DE PESSOAS: ");
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Nomes: ");
        int indice = 1;
        for (Pessoa pessoas : listaDePessoas) {
            System.out.println(indice + " -- " + listaDePessoas.get(indice - 1).getNome());
            indice++;
        }

        System.out.println("\nImprimindo a lista completa: ");
        for (Pessoa pessoas : listaDePessoas) {
            System.out.println("Nome: " + pessoas.getNome() + " - Idade: " + pessoas.getIdade());
        }
    }
}
