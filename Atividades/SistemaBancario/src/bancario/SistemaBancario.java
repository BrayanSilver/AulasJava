package bancario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SistemaBancario {
    private static List<Cliente> clientes = new ArrayList<>();
    private static int proximoNumeroConta = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    criarConta();
                    break;
                case 3:
                    realizarDeposito();
                    break;
                case 4:
                    realizarSaque();
                    break;
                case 5:
                    realizarTransferencia();
                    break;
                case 6:
                    listarClientesEContas();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA BANCÁRIO ===");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Criar Conta");
        System.out.println("3. Realizar Depósito");
        System.out.println("4. Realizar Saque");
        System.out.println("5. Realizar Transferência");
        System.out.println("6. Listar Clientes e Contas");
        System.out.println("7. Sair");
    }

    private static void cadastrarCliente() {
        System.out.println("\n=== CADASTRO DE CLIENTE ===");
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        String cpf;
        do {
            System.out.print("CPF do cliente (apenas números): ");
            cpf = scanner.nextLine();
            if (!validarCPF(cpf)) {
                System.out.println("CPF inválido! Deve conter 11 dígitos numéricos.");
            }
        } while (!validarCPF(cpf));

        if (encontrarClientePorCpf(cpf) != null) {
            System.out.println("Já existe um cliente cadastrado com este CPF!");
            return;
        }

        clientes.add(new Cliente(nome, cpf));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void criarConta() {
        System.out.println("\n=== CRIAÇÃO DE CONTA ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro.");
            return;
        }

        listarClientes();
        String cpf = lerCpfCliente();
        Cliente cliente = encontrarClientePorCpf(cpf);
        if (cliente == null) return;

        System.out.println("\nTipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipo = lerInteiro("Escolha: ");
        if (tipo < 1 || tipo > 2) {
            System.out.println("Tipo de conta inválido!");
            return;
        }

        double saldoInicial = lerDouble("Saldo inicial: R$");

        Conta conta;
        if (tipo == 1) {
            conta = new ContaCorrente(proximoNumeroConta, cliente.getNome(), saldoInicial);
        } else {
            conta = new ContaPoupanca(proximoNumeroConta, cliente.getNome(), saldoInicial);
        }

        cliente.adicionarConta(conta);
        System.out.println("\n=== CONTA CRIADA COM SUCESSO ===");
        System.out.println("Número da conta: " + proximoNumeroConta);
        System.out.println("Tipo: " + (tipo == 1 ? "Conta Corrente" : "Conta Poupança"));
        System.out.printf("Saldo inicial: R$%.2f\n", saldoInicial);
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF do titular: " + cliente.getCpf());

        proximoNumeroConta++;
    }

    private static void realizarDeposito() {
        System.out.println("\n=== DEPÓSITO ===");
        Conta conta = selecionarConta();
        if (conta == null) return;

        double valor = lerDouble("Valor do depósito: R$");
        conta.depositar(valor);
    }

    private static void realizarSaque() {
        System.out.println("\n=== SAQUE ===");
        Conta conta = selecionarConta();
        if (conta == null) return;

        double valor = lerDouble("Valor do saque: R$");
        conta.sacar(valor);
    }

    private static void realizarTransferencia() {
        System.out.println("\n=== TRANSFERÊNCIA ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        listarClientes();
        String cpf = lerCpfCliente();
        Cliente cliente = encontrarClientePorCpf(cpf);
        if (cliente == null) return;

        if (cliente.getContas().size() < 2) {
            System.out.println("Você precisa ter pelo menos 2 contas para transferência!");
            return;
        }

        cliente.listarContas();

        int origemNum = lerInteiro("Número da conta de origem: ");
        Conta origem = cliente.encontrarContaPorNumero(origemNum);
        if (origem == null) {
            System.out.println("Conta de origem não encontrada!");
            return;
        }

        int destinoNum = lerInteiro("Número da conta de destino: ");
        Conta destino = cliente.encontrarContaPorNumero(destinoNum);
        if (destino == null) {
            System.out.println("Conta de destino não encontrada!");
            return;
        }

        if (origemNum == destinoNum) {
            System.out.println("Não é possível transferir para a mesma conta!");
            return;
        }

        double valor = lerDouble("Valor da transferência: R$");
        origem.transferir(destino, valor);
    }

    private static void listarClientesEContas() {
        System.out.println("\n=== CLIENTES E CONTAS ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println("\nCliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            cliente.listarContas();
        }
    }

    private static void listarClientes() {
        System.out.println("\nClientes cadastrados:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome() + " - CPF: " + clientes.get(i).getCpf());
        }
    }

    private static Conta selecionarConta() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return null;
        }

        listarClientes();
        String cpf = lerCpfCliente();
        Cliente cliente = encontrarClientePorCpf(cpf);
        if (cliente == null) return null;

        if (cliente.getContas().isEmpty()) {
            System.out.println("Este cliente não possui contas cadastradas.");
            return null;
        }

        cliente.listarContas();
        int numeroConta = lerInteiro("Número da conta: ");
        return cliente.encontrarContaPorNumero(numeroConta);
    }

    private static String lerCpfCliente() {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        if (encontrarClientePorCpf(cpf) == null) {
            System.out.println("Cliente não encontrado!");
            return null;
        }
        return cpf;
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido!");
                scanner.nextLine();
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um valor válido!");
                scanner.nextLine();
            }
        }
    }

    private static boolean validarCPF(String cpf) {
        return cpf != null && cpf.length() == 11 && cpf.matches("\\d+");
    }

    private static Cliente encontrarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}