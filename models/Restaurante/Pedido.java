package models.Restaurante;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    public int numero;
    public String data;
    public double valorTotal;
    public List<Produto> produtos = new ArrayList<>();
    public Cliente cliente;

    public Pedido(int numero, String data, Cliente cliente){
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.valorTotal = 0.0;
    }


}
