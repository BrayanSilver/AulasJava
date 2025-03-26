import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome da música escolhida: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o nome do artista: ");
            String artista = scanner.nextLine();

            System.out.print("Digite quantos minutos tem a música:");
            int minutos = scanner.nextInt();

            System.out.print("Digite quantos segundos: ");
            int segundos = scanner.nextInt();
            scanner.nextLine();

            Musica musica = new Musica(titulo, artista, minutos, segundos);
            playlist.adicionarMusica(musica);

            System.out.print("adicionar mais uma música? \n s - sim \n n - não ");
            continuar = scanner.nextLine();
        }

        playlist.exibirInfo();

        scanner.close();
    }
}
