import java.util.Scanner;

public class Resposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de aprovação de empréstimos!");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a renda anual: ");
        double rendaAnual = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Possui empréstimos pendentes? (true/false): ");
        String temEmprestimosPendentes = scanner.nextLine();

        Cliente cliente = new Cliente(nome, idade, rendaAnual, temEmprestimosPendentes);

        System.out.print("Digite o valor do empréstimo solicitado: ");
        double valorEmprestimo = scanner.nextDouble();

        Emprestimo emprestimo = new Emprestimo(valorEmprestimo);

        String resultado = AprovacaoEmprestimo.verificarAprovacao(cliente, emprestimo);
        System.out.println("\nResultado da solicitação de empréstimo:");
        System.out.println(resultado);

        scanner.close();
    }
}
