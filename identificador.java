package notasdeclase;

import java.util.Scanner;

public class identificador {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);


        String[] rostros = { "Carlos","Maria","Pedro" };

        System.out.println("acerque su rostro");
        String studentFace= sc.nextLine();

        if(studentFace.equals(rostros[0])|| studentFace.equals(rostros[1])|| studentFace.equals(rostros[2])){
            System.out.println("bienvenido");
        }else{
            System.out.println("dirijase a la oficina de registro o control");
        }
    }
}
