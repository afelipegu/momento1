package notasdeclase;

import java.util.Scanner;

public class CalculadoraImc
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] arg)
    {
    double imc =  calcularImc(50, 1.80);
    leerImc(imc);
    }


    public static double calcularImc(double peso, double estatura)
    {
        double imc = peso / (estatura * estatura);
        return imc;
    }

    public static double leerImc(double imc) {

        if (imc < 18) {
            System.out.println("estas flaco");
        } else if (imc <= 18 && imc < 25) {
            System.out.println("estas bien");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("estas gordo");
        }

        return imc;
    }

    public static void recomendador ()
    {




    }


}

