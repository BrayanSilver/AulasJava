package IntroducaoClassesTest.Atividades;
import java.util.Scanner;

public class SaldoReajuste1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        double saldoComReajuste = saldo + (saldo * 0.01);

        System.out.println("Saldo com reajuste de 1%: " + saldoComReajuste);

        scanner.close();
    }
}

