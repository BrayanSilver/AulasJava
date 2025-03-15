package IntroducaoClassesTest.Atividades;
import java.util.Scanner;
public class Desafio03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();


        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }

}
