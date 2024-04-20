package notasdeclase;

import java.util.Scanner;

public class Operador
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        //OPERADORES ARITMETICOS ( +, -, *, /, %)

            //suma
            int resultadoSuma = num1 + num2;
            System.out.println("el resultado de la suma es: " + resultadoSuma);


        // COMPARACION (<, >, <=, >=, ==, !=) RETORNAN UN BOOLEANO

            boolean esMayor = num1 > num2;
            System.out.println( num1 + "Es mayor que"  + num2 + ": " +esMayor);

        //OPERADORES LOGICOS (||, &&, not)

            boolean validaEmail = true;
            boolean validaPhone = true;
            boolean validaPassword = false;

            boolean iniciaSesion = (validaEmail || validaPhone) && validaPassword;

            System.out.println("Inicia sesion: " + iniciaSesion);

        //OPERADORES ASIGNACION ( =, :)

            int res = 0;
            res = res + num1;
            res += num2;
            System.out.println( "el valor de res es: " +res);




    }
}
