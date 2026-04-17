package praticando_poo_classes_atributos_metodos.Exercicio07;

public class Tarefas {

    String descricao;
    boolean concluida;

    void status() {
        System.out.printf("Tarefa: %s - Status: ", descricao);

        if (concluida) {
            System.out.println("Concluída");
        } else {
            System.out.println("Pendente");
        }
    }
}
