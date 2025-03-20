package models.AprovaEmprestimo;

import java.util.Scanner;

public class EmprestimoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" APROVACAO EMPRESTIMO!!!! :))))) ");
        System.out.print("Digite o valor da sua renda: ");
        double rendaAnual = scanner.nextDouble();
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();
        AnaliseAprovacao analise = new AnaliseAprovacao(rendaAnual, valorEmprestimo);
        analise.analisarEmprestimo();
        scanner.close();
    }
}
