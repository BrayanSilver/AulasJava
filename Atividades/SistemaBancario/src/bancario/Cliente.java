package bancario;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("\nCliente " + nome + " não possui contas cadastradas!");
            return;
        }

        System.out.println("\n=== Contas do cliente " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println("----------------------");
            conta.exibirDetalhes();
        }
        System.out.println("----------------------");
    }

    public Conta encontrarContaPorNumero(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }
}