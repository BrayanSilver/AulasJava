import java.util.Scanner;

public class SistemaGerenciamentoTarefas {
    private static GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    inserirTarefa();
                    break;
                case 2:
                    gerenciadorTarefas.listarTarefas();
                    break;
                case 3:
                    gerenciadorTarefas.listarTarefasConcluidas();
                    break;
                case 4:
                    gerenciadorTarefas.listarTarefasPendentes();
                    break;
                case 5:
                    excluirTarefa();
                    break;
                case 6:
                    gerenciadorTarefas.excluirTodasTarefas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n :))) Sistema de Gerenciamento de Tarefas :)))");
        System.out.println("1 - Inserir uma nova tarefa");
        System.out.println("2 - Listar todas as tarefas");
        System.out.println("3 - Listar tarefas concluídas");
        System.out.println("4 - Listar tarefas pendentes");
        System.out.println("5 - Excluir uma tarefa");
        System.out.println("6 - Excluir todas as tarefas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void inserirTarefa() {
        System.out.print("Digite o título da tarefa: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(titulo, descricao);
        gerenciadorTarefas.adicionarTarefa(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    private static void excluirTarefa() {
        System.out.print("Digite o índice da tarefa a ser excluída: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        gerenciadorTarefas.excluirTarefa(index);
    }
}
