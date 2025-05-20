package inicio;

import java.util.Scanner;

public class Menu {

    //usuario -> contraseña
    private static final String[] usuarios = { "user1", "user2" };
    private static final String[] contrasenas = { "U123", "U456" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu usuario:");
        String usuario = sc.nextLine();

        System.out.println("Por favor, ingresa tu contraseña:");
        String contrasena = sc.nextLine();

        if (validarCredenciales(usuario, contrasena)) {
            System.out.println("Bienvenido a nuestra tienda PUPIS, " + usuario + "!!!");
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos.");
        }

        sc.close();
    }

    public static boolean validarCredenciales(String usuario, String contrasena) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                return true;
            }
        }
        return false; 
    }

public static void mostrarMenu() {
    


    Scanner scanner = new Scanner(System.in);
    int opcion = 0; 

    while(opcion !=7) {
        System.out.println("\n -- Menu de gestion - Articulos --");
        System.out.println("1)Agregar producto");
        System.out.println("2)Listar productos");
        System.out.println("3)Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear un pedido");
        System.out.println("6) Listar pedidos");
        System.out.println("7) Salir");
        System.out.println(" Elejir una opcion:  ");

    

        opcion=scanner.nextInt();

        switch (opcion) {
                case 1:
                System.out.println("Opción agregar artículo seleccionado");
                break;

                case 2:
                System.out.println("Opción Lista Productos");
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
    }
    scanner.close();
}   
}