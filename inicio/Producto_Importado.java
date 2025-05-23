package inicio;

public class Producto_Importado extends Producto {

    private String estado;
    private String pais;
    private String marca;

    public Producto_Importado(int id_producto, String nombre, double precio, String descripcion, String categoria,
            int cant_Stock,
            String estado, String pais, String marca) {
        super(id_producto, nombre, precio, descripcion, categoria, cant_Stock);
        this.estado = estado;
        this.pais = pais;
        this.marca = marca;

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " | Estado: " + estado + " | País: " + pais + " | Marca: " + marca + " | Producto Importado"; 
    }

}
