public class Medicamento {
    private String codigoBarras;
    private String nome;
    private String descricao;
    private String laboratorio;
    private double precoCusto;
    private boolean controlado;
    private int quantidadeEstoque;

    public Medicamento(String codigoBarras, String nome, String descricao, String laboratorio, double precoCusto, boolean controlado, int quantidadeEstoque) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.precoCusto = precoCusto;
        this.controlado = controlado;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public boolean isControlado() {
        return controlado;
    }

    public void setControlado(boolean controlado) {
        this.controlado = controlado;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("A quantidade não pode ser negativa!");
        }
    }

    public double calcularPrecoVenda() {
        return precoCusto + (precoCusto * 0.33);
    }

    public String exibirDetalhes() {
        return "Código de Barras: " + codigoBarras + "\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Laboratório: " + laboratorio + "\n" +
                "Preço de Custo: R$ " + precoCusto + "\n" +
                "Preço de Venda: R$ " + calcularPrecoVenda() + "\n" +
                "Medicamento Controlado: " + (controlado ? "Sim" : "Não") + "\n" +
                "Quantidade em Estoque: " + quantidadeEstoque;
    }
}
