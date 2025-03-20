package models.Restaurante;
import java.util.List;
import java.util.ArrayList;

public class Restaurante {

    public String nome;
    public String endereco;
    public List<Pedido> pedidos = new ArrayList<>();  // Corrected variable name

    public Restaurante(String nome, String endereco, String number){
        this.nome = nome;  // Corrected this order to match the constructor parameters
        this.endereco = endereco;
    }

    public void receberPedido(Pedido pedido){  // Fixed typo here
        pedidos.add(pedido);  // Corrected variable name to 'pedidos'

        System.out.println("Pedido recebido no restaurante " + nome);  // Added a space after the word 'restaurante'
    }

    public List<Pedido> listaPedidos(){  // Fixed method name to be more conventional
        return pedidos;
    }
}
