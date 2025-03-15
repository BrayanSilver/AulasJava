package IntroducaoClassesTest.Atividades;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu batimento cardíaco: ");
        int batimentoCardiaco = scanner.nextInt();

        String classificacao = "";

        if (idade > 60 && batimentoCardiaco > 150) {
            classificacao = "URGENTE";
        } else if (idade > 60 && batimentoCardiaco <= 150) {
            classificacao = "Urgência moderada";
        } else if (idade <= 60 && batimentoCardiaco > 150) {
            classificacao = "Urgência moderada";
        } else {
            classificacao = "Nao urgente";
        }

        System.out.println(classificacao);
        scanner.close();
    }
}

