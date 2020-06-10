package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        int contra;
        contra = 1234;
        
        Scanner sc = new Scanner(System.in);
        contra = sc.nextInt();
        if (contra == 1234) {
            //CODIGO
            System.out.println("Contraseña correcta");
        } else {
            //CODIGO
            System.out.println("Contraseña incorrecta");            
        }
    }

}
