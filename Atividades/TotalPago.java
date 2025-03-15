package IntroducaoClassesTest.Atividades;

import java.util.Scanner;

public class TotalPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double IPI = scanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorPeca1 = scanner.nextDouble(); //ela tbm aceita numeros com virgula;
        System.out.print("Digite a quantidade da peça 1: ");
        int quantidadePeca1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorPeca2 = scanner.nextDouble();
        System.out.print("Digite a quantidade da peça 2: ");
        int quantidadePeca2 = scanner.nextInt();

        double total = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (IPI / 100 + 1);

        System.out.println("Valor total a ser pago: R$ " + total);

        scanner.close();
    }
}
