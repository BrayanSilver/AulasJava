public class Cliente {
    private String nome;
    private int idade;
    private double rendaAnual;
    private String temEmprestimosPendentes;

    public Cliente(String nome, int idade, double rendaAnual, String temEmprestimosPendentes) {
        this.nome = nome;
        this.idade = idade;
        this.rendaAnual = rendaAnual;
        this.temEmprestimosPendentes = temEmprestimosPendentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public String temEmprestimosPendentes() {
        return temEmprestimosPendentes;
    }

    public void setTemEmprestimosPendentes(String temEmprestimosPendentes) {
        this.temEmprestimosPendentes = temEmprestimosPendentes;
    }
}