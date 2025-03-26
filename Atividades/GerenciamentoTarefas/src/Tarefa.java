public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;


    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false; // Tarefa começa como não concluída
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String tarefaToString() {
        return "Tarefa [Título: " + titulo + ", Descrição: " + descricao + ", Status: " + (concluida ? "Concluída" : "Pendente") + "]";
    }
}
