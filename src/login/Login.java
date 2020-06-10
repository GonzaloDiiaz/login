package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        int contra;
        contra = 1234;
        
        Scanner sc = new Scanner(System.in);
        contra = sc.nextInt();
        if (contra == 1234) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");            
        }
    }

}
