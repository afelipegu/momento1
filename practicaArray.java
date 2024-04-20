package notasdeclase;

import java.util.Scanner;

public class practicaArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //como se declara un array

        //primer caso llenar un formulario:

        System.out.println("indique la cantidad de usuarios  a ingresar");
        int row = sc.nextInt();
        sc.nextLine();

       // int col = sc.nextInt();

        String usuarios[][] = new String[row][5];

        String [] encabezados = {"nombre","apellido","telefono","correo","contrseña"};

        String[] datosUsuario = new String[5];  //declarar un array

        //datosUsuario[0]= "pepito";

        usuarios[0] = encabezados;
        usuarios[1] = datosUsuario;

        System.out.println("escriba 1: Nombre\n" +
                "2:apellido\n" +
                "....");

        for (int i = 0; i<datosUsuario.length; i++){
            System.out.println("ingrese el dato #" + (encabezados[i]+1));
            datosUsuario[i] = sc.nextLine();
        }

        for (String dato : datosUsuario){
            System.out.println(dato);
        }

        for (int i = 0; i< usuarios.length; i++){
            for (int j =0; j<usuarios[i].length; j++){
                System.out.print(usuarios[i][j] + "       ");
            }
            System.out.println("\n");
        }

    }

}
