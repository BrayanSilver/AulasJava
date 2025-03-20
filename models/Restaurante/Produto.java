package models.Restaurante;

public class Produto {
    public String nome;
    public double preco;
    String descricao;

    // Fixed the constructor parameter syntax error
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Method to return the details of the product
    public String detalhes() {
        return nome + " - " + descricao + " - " + "R$" + preco;
    }
}
