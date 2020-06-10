package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String contra;
        String register;
        String nombre;
        String nombreInic;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        nombre = sc.next();
        System.out.println("Ingrese una contraseña: ");
        register = sc.next();
        System.out.println("Ingrese Nombre de usuario: ");
        nombreInic = sc.next();

        if (nombre.equals(nombreInic)) {
            System.out.println("Nombre correcta");
            System.out.println("Ahora ingrese la contraseña: ");
            contra = sc.next();
            if (register.equals(contra)) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Nombre incorrecto");
        }
    }

}
