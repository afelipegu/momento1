package notasdeclase;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // imc = si el imc es 18 o menos -> bajo peso
        // imc = mayor a 18 y menor a 25 - > peso normal
        // imc = mayor igual a 25 y menor que 30 tiene sobrepeso
        // imc = mayor igual a 30 es  obesidad

        System.out.println("ingrese su peso");
        double peso = sc.nextDouble();
        System.out.println("ingrese su estatura");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso/(estatura*estatura));

        System.out.println(imc);

        if(imc<18){
            System.out.println("su imc corresponde a bajo peso ");
        }else if(imc >= 18 && imc < 25){
            System.out.println("su imc corresponde a un nivel de peso normal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("su imc corresponde a sobrepeso");
        }else if(imc >= 30){
            System.out.println("su imc corresponde a obesidad");
        }
    }
}
