import java.util.Scanner;

public class SistemaFarmacia {
    private static GerenciadorMedicamentos gerenciador = new GerenciadorMedicamentos();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarMedicamento();
                    break;
                case 2:
                    gerenciador.listarMedicamentos();
                    break;
                case 3:
                    atualizarQuantidadeEstoque();
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
        System.out.println("\n<><> Sistema de Cadastro de Medicamentos <><>***");
        System.out.println("1 - Cadastrar um novo medicamento");
        System.out.println("2 - Listar todos os medicamentos");
        System.out.println("3 - Atualizar quantidade em estoque");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarMedicamento() {
        System.out.print("Digite o código de barras: ");
        String codigoBarras = scanner.nextLine();
        System.out.print("Digite o nome do medicamento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição do medicamento: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o nome do laboratório: ");
        String laboratorio = scanner.nextLine();
        System.out.print("Digite o preço de custo: ");
        double precoCusto = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("É um medicamento controlado? \n true - sim:\n" +
                "false - não ");
        boolean controlado = scanner.nextBoolean();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();

        Medicamento medicamento = new Medicamento(codigoBarras, nome, descricao, laboratorio, precoCusto, controlado, quantidadeEstoque);
        gerenciador.adicionarMedicamento(medicamento);
    }

    private static void atualizarQuantidadeEstoque() {
        System.out.print("Digite o código de barras do medicamento para atualizar a quantidade: ");
        String codigoBarras = scanner.nextLine();
        System.out.print("Digite a nova quantidade em estoque: ");
        int novaQuantidade = scanner.nextInt();
        scanner.nextLine();
        gerenciador.atualizarQuantidadeEstoque(codigoBarras, novaQuantidade);
    }
}
