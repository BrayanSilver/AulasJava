import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public int getQuantidadeDeMusicas() {
        return musicas.size();
    }

    public int getDuracaoTotalEmSegundos() {
        int duracaoTotal = 0;
        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracaoEmSegundos();
        }
        return duracaoTotal;
    }

    public void exibirInfo() {
        System.out.println("Playlist: " + nome);
        System.out.println("Quantidade de músicas: " + getQuantidadeDeMusicas());
        System.out.println("Duração total: " + getDuracaoTotalEmSegundos() / 60 + "minutos " + getDuracaoTotalEmSegundos() % 60 + "s");
        System.out.println("Músicas: ");
        for (Musica musica : musicas) {
            musica.exibirInfo();
            System.out.println("------");
        }
    }
}
