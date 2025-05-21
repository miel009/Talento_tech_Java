package inicio;

import java.util.Scanner;

public class Producto {

    private int id_producto; 
    private String nombre;
    private double precio;
    private int cant_Stock;
    
    public Producto (int pedido, String nombre , double precio, int cant_Stock){
        this.id_producto = id_producto++;
        this.nombre= nombre;
        this.precio= precio; 
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
    //metodos-funciones 


    public String AgregarProducto(int id_pedido, String nombre, double precio){

        // pedido de id , nombre etc a usuario 
        Scanner 

        // genera un obj producto
        return new Producto(); 

    }



}
