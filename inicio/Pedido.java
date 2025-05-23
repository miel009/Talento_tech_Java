package inicio;

import java.util.ArrayList;

public class Pedido {

    private static int contador_pedidos = 1;
    private int num_Pedido; 
    private ArrayList<String> pedidoLista; 
    

    public Pedido() {
        this.num_Pedido= contador_pedidos++; 
        this.pedidoLista= new ArrayList<>();
        
    }   

    public int getNum_Pedido() {
        return num_Pedido;
    }
    public void setNum_Pedido(int num_Pedido) {
        this.num_Pedido = num_Pedido;
    }

    public ArrayList<String> getPedidoLista() {
        return pedidoLista;
    }

    public void setPedidoLista(ArrayList<String> pedidoLista) {
        this.pedidoLista = pedidoLista;
    }

    
   
}
