package praticando_poo_classes_atributos_metodos.Exercicio07;

public class Main {
    public static void main(String[] args) {

        Tarefas t1 = new Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefas t2 = new Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        t1.status();
        t2.status();
    }
}
