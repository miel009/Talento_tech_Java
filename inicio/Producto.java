package inicio;

import java.util.Scanner;

public class Producto {

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


    //metodos-funciones 

    public static Producto AgregarProducto(int id_producto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nombre del producto:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese precio del producto:");
        double precio = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Ingrese descripción:");
        String descripcion = sc.nextLine();

        System.out.println("Ingrese categoría:");
        String categoria = sc.nextLine();

        System.out.println("Ingrese stock:");
        int cant_Stock = sc.nextInt();
        sc.nextLine(); 
        
        return new Producto(id_producto, nombre, precio, descripcion, categoria, cant_Stock);
    }
}





