package notasdeclase;

import java.util.Scanner;

public class practicaArray3 {

    static Scanner sc = new Scanner(System.in);

    static String registroUsuario = new String[3];

    public static void main(String[] args) {


        //en esta practica vamos a usar un for para un inicio de sesion  en un Array
        // solo puede guardar un tipo de dato

        for (int i = 0; i < registroUsuario.length; i++) {
            System.out.println("ingrese el dato " + (i) + 1);
            registroUsuario[i] = sc.nextLine();
        }
        iniciarSesion();


            public static void inicirSesion(){

            System.out.println("ingrese el correo registrado:");
            String correo =sc.nextLine();
            System.out.println("ingrese la contraseña");
            String contraseña =sc.nextLine();

            if (correo.equals(registroUsuario[1])&& contraseña.equals(registroUsuario[2])){

                System.out.println("bienvenido" + registroUsuario[0]);

                for (String dato:registroUsuario)
            }else{
                System.out.println("valide sus credenciales");
            }
        }
    }
}
