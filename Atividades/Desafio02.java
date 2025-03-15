package IntroducaoClassesTest.Atividades;
import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu sexo (m para masculino, f para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal = 0;

        if (sexo == 'm' || sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'f' || sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo nao reconhecido.");
        }

        if (pesoIdeal != 0) {
            System.out.println("Peso ideal: " + pesoIdeal + " kg");
        }

        scanner.close();
    }
}
