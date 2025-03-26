import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeNotas {
    private ArrayList<Aluno> alunos;

    public SistemaDeNotas() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome) {
        alunos.add(new Aluno(nome));
        System.out.println("Aluno " + nome + " adicionado.");
    }

    public void adicionarNota(String nome, double nota) {
        Aluno aluno = encontrarAluno(nome);
        if (aluno != null) {
            aluno.adicionarNota(nota);
            System.out.println("Nota adicionada para " + nome);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void calcularMedia(String nome) {
        Aluno aluno = encontrarAluno(nome);
        if (aluno != null) {
            double media = aluno.calcularMedia();
            System.out.println("A média das notas de " + nome + " é: " + media);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private Aluno encontrarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de Notas");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Adicionar nota");
            System.out.println("3. Calcular média de aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                adicionarAluno(nome);

                while (true) {
                    System.out.println("1. Adicionar nota para " + nome);
                    System.out.println("2. Calcular média de " + nome);
                    System.out.println("3. Voltar ao menu principal");
                    System.out.print("Escolha uma opção: ");
                    int opcaoAluno = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoAluno == 1) {
                        System.out.print("Digite a nota: ");
                        double nota = scanner.nextDouble();
                        scanner.nextLine();
                        adicionarNota(nome, nota);
                    } else if (opcaoAluno == 2) {
                        calcularMedia(nome);
                    } else if (opcaoAluno == 3) {
                        break;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }

            } else if (opcao == 2) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a nota: ");
                double nota = scanner.nextDouble();
                scanner.nextLine();
                adicionarNota(nome, nota);

            } else if (opcao == 3) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                calcularMedia(nome);

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        SistemaDeNotas sistema = new SistemaDeNotas();
        sistema.exibirMenu();
    }
}
