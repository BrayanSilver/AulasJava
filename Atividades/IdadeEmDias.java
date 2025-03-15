package IntroducaoClassesTest.Atividades;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // o usuario vai digitar a idade em ano mes e dia:

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        // resultado:
        System.out.println("A idade total em dias é: " + totalDias);


        scanner.close();
    }
}
