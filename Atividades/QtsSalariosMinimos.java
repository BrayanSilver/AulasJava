package IntroducaoClassesTest.Atividades;

import java.util.Scanner;

public class QtsSalariosMinimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1500.00;
        System.out.print("Digite o valor do seu salário: R$ ");
        double salarioUsuario = scanner.nextDouble();
        System.out.println("Você ganha " + (salarioUsuario / salarioMinimo) + " salários mínimos.");
        scanner.close();
    }
}
