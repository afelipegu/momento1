package notasdeclase;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //1. recomendaciones imc = bajo peso
        //2. recomendaciones imc = peso normal
        //3. recomendaciones imc = sobrepeso
        //4. recomendaciones imc = obesidad

        System.out.println("seleccione \n" +
                "1. bajo peso \n" +
                "2. peso normal \n" +
                "3. sobrepeso \n" +
                "4. obesidad");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("recomendaciones para aumentar el imc");
                break;
            case 2:
                System.out.println("recomendaciones medicas para mantener el imc normal");
                break;
            case 3:
                System.out.println("recomendaciones medicas para dismunuir el imc ");
                break;
            case 4:
                System.out.println("recomendaciones medicas para tratar la obesidad");
                break;
            default:
                System.out.println("ingrese una opcion valida ");
                break;
        }

    }
}
