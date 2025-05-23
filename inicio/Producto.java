package inicio;

public abstract class Producto  {

    private int id_producto; 
    private String nombre;
    private double precio;
    private String descripcion;
    private String categoria; 
    private int cant_Stock;


    public Producto (int id_producto, String nombre , double precio,String descripcion, String categoria, int cant_Stock){
        this.id_producto = id_producto;
        this.nombre= nombre;
        this.precio= precio; 
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.cant_Stock=cant_Stock; 

    } 
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant_Stock() {
        return cant_Stock;
    }

    public void setCant_Stock(int cant_Stock) {
        this.cant_Stock = cant_Stock;
    }

    @Override
    public String toString() {
        return "ID: " + id_producto + " | Nombre: " + nombre + " | Precio: " + precio + " | Descripción: "
                + descripcion + " | Categoría: " + categoria + " | Stock: " + cant_Stock;
    }   
    
    

   
}





