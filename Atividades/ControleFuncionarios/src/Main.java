import java.util.Scanner;  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("digite sua mtc");
        funcionario.setMatricula(scanner.nextLine());
        System.out.println("digite sua nome");
        funcionario.setNome(scanner.nextLine());
        System.out.println("digite sua salario");
        funcionario.setSalario(scanner.nextDouble());
        System.out.println("digite sua cargo");
        funcionario.setCargo(scanner.nextLine());

        System.out.println(funcionario.getCargo()+ funcionario.getMatricula()+funcionario.getNome());
    }
}
