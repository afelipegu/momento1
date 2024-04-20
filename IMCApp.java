package notasdeclase;

import java.util.Scanner;

public class IMCApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = "Cliente";
        String email = "cliente@correo.com";
        String password = "Ichigo";

        System.out.println("Digite el nombre del cliente");
        String Cliente = sc.nextLine();
        System.out.println("Digite el correo electónico");
        String email1 = sc.next();
        System.out.println("CONTRASEÑA");
        String pass = sc.next();
        System.out.println(Cliente);
        System.out.println(email1);
        System.out.println(pass);




    }
}
