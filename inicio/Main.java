package inicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = null;
        do {
            System.out.println(" --- Ingresar contraseña(clave: M148) : ");

            password = sc.nextLine();// guardo

        } while (!password.equals("M148"));

        System.out.println("Bienvenido! ");

        ArrayList<Producto> listaProductos = new ArrayList<>();
        int idContador = 1;

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n -- Menu de gestion - Articulos --");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir");
            System.out.println(" Elejir una opcion:  ");

            
            opcion = sc.nextInt();
           

            switch (opcion) {
                case 1:
                    System.out.println("Opción Lista Productos");
                    System.out.println("Agregar nuevo producto:");
                    Producto nuevoProducto = Producto.AgregarProducto(idContador);
                    listaProductos.add(nuevoProducto);
                    idContador++;
                    System.out.println("Producto agregado correctamente.");
                    break;
                // FELIZ CUMPLE!!!
                case 2:
                    
                    System.out.println("Lista de productos:");
                    for (Producto p : listaProductos) {
                        System.out.println("ID: " + p.getId_producto() + " | Nombre: " + p.getNombre() + " | Precio: $" + p.getPrecio() + "|Descripcion: "+ p.getDescripcion() + "|Categoria:" + p.getCategoria() + "|Stock disponible: "+ p.getCant_Stock());
                    }
                    break;

                case 3:
                    System.out.println("Opción Buscar / Actualizar");
                    break;

                case 4:
                    System.out.println("Opción eliminar producto");
                    break;

                case 5:
                    System.out.println("Opción crear pedido");
                    break;

                case 6:
                    System.out.println("Opción listar pedido");
                    break;

                default:
                    break;
            }

        } /// cierre del bucle
        sc.close();
    }
}
