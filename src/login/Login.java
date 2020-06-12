package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String contra;
        String register;
        String nombre;
        String nombreInic;
        int intentos = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Registrese: ");
        System.out.println("Ingrese el nombre de usuario: ");
        nombre = sc.next();
        System.out.println("Ingrese una contraseña: ");
        register = sc.next();
        System.out.println("Loguarse: ");
        System.out.println("Ingrese su nombre de usuario: ");
        nombreInic = sc.next();

        if (nombre.equals(nombreInic)) {
            System.out.println("Nombre correcto");

            while (intentos >= 0) {
                System.out.println("Ahora ingrese su contraseña: ");
                contra = sc.next();
                if (register.equals(contra)) {
                    System.out.println("Sesion iniciada");
                    break;
                } else {
                    System.out.println("Contraseña incorrecta");
                    System.out.println("Te quedan " + intentos + " intentos");
                    intentos--;
                }
            }
        } else {
            System.out.println("Nombre incorrecto");
        }
    }
}
