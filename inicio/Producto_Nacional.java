package inicio;

public class Producto_Nacional extends Producto{ 

    public Producto_Nacional(int id_producto, String nombre, double precio, String descripcion, String categoria,
            int cant_Stock) {
        super(id_producto, nombre, precio, descripcion, categoria, cant_Stock);
    }   
    @Override
    public String toString() {
        return super.toString() + " | Producto Nacional";
    }

}
