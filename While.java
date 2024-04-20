package notasdeclase;

import java.util.Scanner;

public class While {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int servicios = 8;

        while (servicios > 0 ){

            System.out.println("servicio" + servicios);
            //servicios -=1;
            servicios--;
        }
    }
}
