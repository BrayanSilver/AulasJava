public class Musica {
    private String titulo;
    private String artista;
    private int minutos;
    private int segundos;

    public Musica(String titulo, String artista, int minutos, int segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getDuracaoEmSegundos() {
        return (minutos * 60) + segundos;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração da música: " + minutos + "min " + segundos + "s");
    }
}
