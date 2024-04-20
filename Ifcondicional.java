package notasdeclase;

import java.util.Scanner;

public class Ifcondicional
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        String email = "pepito@gmail.com";

        String phone = "3127456874";

        int pasword = 123456;

        System.out.print("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.print("Ingrese su password: ");
        int Userpasword = sc.nextInt();

        if ( (user.equals(email)|| user.equals(phone) ) && Userpasword == pasword)
        {
            System.out.println("Bienvenido ");
        }
        else
        {
            System.out.println("valide credenciales ");
        }



    }

}
