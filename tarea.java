package notasdeclase;

import java.util.Scanner;

public class tarea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("seleccione \n" +
                "1. registro \n" +
                "2. inicio de sesion \n" +
                "3. salir");
        int opc = sc.nextInt();
        String opc2 = sc.nextLine();
        String nombre = "luis";
        String cc = "1234567";


        switch (opc) {
            case 1:
                System.out.println("registro");
                break;
            case 2:
                System.out.println("inicio de sesion");
                break;
            case 3:
                System.out.println("salir");
                break;
        }


        String email = "pepito@gmail.com";

        String phone = "3127456874";

        int pasword = 123456;

        System.out.print("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.print("Ingrese su password: ");
        int Userpasword = sc.nextInt();

        if ((user.equals(email) || user.equals(phone)) && Userpasword == pasword) {
            System.out.println("Bienvenido ");
        } else {
            System.out.println("valide credenciales ");
        }
        System.out.println("ingrese su peso");
        double peso = sc.nextDouble();
        System.out.println("ingrese su estatura");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso / (estatura * estatura));

        System.out.println(imc);

        if (imc < 18) {
            System.out.println("su imc corresponde a bajo peso ");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("su imc corresponde a un nivel de peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("su imc corresponde a sobrepeso");
        } else if (imc >= 30) {
            System.out.println("su imc corresponde a obesidad");
        }
        System.out.println("seleccione cual es su IMC para recibir las recomendaciones\n" +
                "1. bajo peso \n" +
                "2. peso normal \n" +
                "3. sobrepeso \n" +
                "4. obesidad");

        int opp = sc.nextInt();

        switch (opp){
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


