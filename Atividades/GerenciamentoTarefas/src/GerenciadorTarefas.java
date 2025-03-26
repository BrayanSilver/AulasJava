import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            for (Tarefa t : tarefas) {
                System.out.println(t.tarefaToString());
            }
        }
    }

    public void listarTarefasConcluidas() {
        boolean encontrou = false;
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                System.out.println(t.tarefaToString());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não há tarefas concluídas.");
        }
    }

    public void listarTarefasPendentes() {
        boolean encontrou = false;
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                System.out.println(t.tarefaToString());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não há tarefas pendentes.");
        }
    }

    public void excluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
            System.out.println("Tarefa excluída com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void excluirTodasTarefas() {
        tarefas.clear();
        System.out.println("Todas as tarefas foram excluídas.");
    }
}
