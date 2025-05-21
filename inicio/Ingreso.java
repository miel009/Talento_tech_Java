package inicio;

import java.util.Scanner;

public class Ingreso {

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
}


