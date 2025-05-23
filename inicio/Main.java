package inicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Producto> listaProductos = new ArrayList<>();
    static ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public static void main(String[] args) {

        String password = null;
        do {
            System.out.println(" --- Ingresar contraseña(clave: M148) : ");

            password = sc.nextLine();

        } while (!password.equals("M148"));

        System.out.println("Bienvenido! ");
        int idContador = 1;

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n -- Menu de gestion - Articulos --");
            System.out.println("1) Agregar producto");
            System.out.println("2) Lista productos");
            System.out.println("3) Buscar/Mostrar producto");
            System.out.println("4) Actualizar producto");
            System.out.println("5) Eliminar producto");
            System.out.println("6) Crear un pedido");
            System.out.println("7) Salir");
            System.out.println(" Elejir una opcion:  ");

            opcion = sc.nextInt();
            sc.nextLine();

            // validar
            if (opcion < 1 || opcion > 7) {
                System.out.println("Opcion invalida. Por favor, elija una opción válida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("¿Que  tipo de producto queres agregar?");
                    System.out.println("1) Producto Nacional");
                    System.out.println("2) Producto Importado");
                    int tipoProducto = sc.nextInt();
                    sc.nextLine();

                    Producto nuevoProducto;
                    if (tipoProducto == 1) {
                        nuevoProducto = agregarProducto(idContador);

                    } else if (tipoProducto == 2) {
                        nuevoProducto = agregarProductoImportado(idContador);
                    } else {
                        System.out.println("Tipo de producto no válido.");
                        break;
                    }
                    listaProductos.add(nuevoProducto);
                    idContador++;
                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos en la lista.");
                    } else {
                        System.out.println("Lista de productos:");
                        for (Producto p : listaProductos) {
                            System.out.println("Producto encontrado: " + p.getNombre());
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Opción Buscar/ mostrar producto");
                    System.out.println("Ingrese el ID del producto a buscar:");
                    int idMostrar = sc.nextInt();
                    boolean mostrar_p = false;
                    for (Producto p : listaProductos) {
                        if (p.getId_producto() == idMostrar) {
                            mostrar_p = true;
                            System.out.println("Producto encontrado: " + p.getNombre());
                            System.out.println(p);
                            break;
                        }
                    }
                    if (!mostrar_p) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Opción actualizar producto");
                    System.out.println("Ingrese el ID del producto a buscar:");
                    int idBuscar = sc.nextInt();
                    boolean encontrado = false;
                    for (Producto p : listaProductos) {
                        if (p.getId_producto() == idBuscar) {
                            encontrado = true;
                            System.out.println("Producto encontrado: " + p.getNombre());
                            System.out.println("Ingrese nuevo nombre:");
                            String nuevoNombre = sc.next();
                            p.setNombre(nuevoNombre);
                            System.out.println("Producto actualizado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }

                    break;
                case 5:
                    eliminarProducto();
                    // Llamar a la función eliminarProducto
                    break;

                case 6:
                    crearPedido();
                    break;
                default:
                    System.out.println("Saliendo...Gracias por su visita!.");
                    break;
            }

        } /// cierre del bucle
        sc.close();
    }

    public static void eliminarProducto() {
        System.out.println("Opción eliminar producto");
        System.out.println("Ingrese el ID del producto a eliminar:");
        int idEliminar = sc.nextInt();
        sc.nextLine();
        boolean eliminado = listaProductos.removeIf(p -> p.getId_producto() == idEliminar);
        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static Producto agregarProducto(int id_producto) {

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

        return new Producto_Nacional(id_producto, nombre, precio, descripcion, categoria, cant_Stock);
    }

    public static Producto agregarProductoImportado(int id_producto) {
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Precio:");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Descripción:");
        String descripcion = sc.nextLine();
        System.out.println("Categoría:");
        String categoria = sc.nextLine();
        System.out.println("Stock:");
        int stock = sc.nextInt();
        sc.nextLine();

        System.out.println("Estado:");
        String estado = sc.nextLine();
        System.out.println("País de origen:");
        String pais = sc.nextLine();
        System.out.println("Marca:");
        String marca = sc.nextLine();

        return new Producto_Importado(id_producto, nombre, precio, descripcion, categoria, stock, estado, pais, marca);
    }

    public static Pedido crearPedido() {

    Pedido nuevoPedido = new Pedido();
    System.out.println("Ingrese ID del pedido:");
    int id_pedido = sc.nextInt();
    sc.nextLine();

    //continuar... 

        return nuevoPedido;
    
    }
}
