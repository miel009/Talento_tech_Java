package inicio;

import java.util.ArrayList;

public class Pedido {

    private int id_pedido;
    private ArrayList<String> pedidoLista; 

    public Pedido(int id_pedido) {
        this.id_pedido= id_pedido; 
        this.pedidoLista= new ArrayList<>();
    }   

    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public ArrayList<String> getPedidoLista() {
        return pedidoLista;
    }

    public void setPedidoLista(ArrayList<String> pedidoLista) {
        this.pedidoLista = pedidoLista;
    }
}
