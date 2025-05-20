package inicio;

import java.util.Scanner;

public class MostarMenu {

public static void mostrarMenu() {
    


    Scanner scanner = new Scanner(System.in);
    int opcion = 0; 

    while(opcion !=7) {
        System.out.println("\n -- Menu de gestion - Articulos --");
        System.out.println("1) Agregar producto");
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
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

