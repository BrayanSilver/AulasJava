package IntroducaoClassesTest.Atividades;

import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (inteiro né): ");
        int numero = scanner.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));

        scanner.close();
    }
}
