package notasdeclase;

public class Arraysimple {
    public static void main(String[]args){

//este tipo de array es estatico
// por lo que no podemos agregar nuevos elementos lo que si puedo hacer es modificar los elementos
// (no puedo aumentar su tamaño de manera automatica)



        int [] edades = {35,45,23,38,46};

        //        index = 0  1 2  3  4            cinco elementos x que la posicion empieza en cero

        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);

        //podemos saber el tamaño de un array usando el atributo.length

        System.out.println(edades.length);

        //edades[5] = 23;

        edades[2]=29;
        System.out.println("esta es la posicion 2 " + edades[2]);

        //para recorrer los arrays tenemos las estructuras for y foreach

        System.out.println("----------------------------------");

        for (int i = 0; i<edades.length; i++){
            System.out.println(edades[i]);

        }


        System.out.println("-----------------------------");
           //forEach es igual a  for (int i = 0; i<edades.length; i++){
        //            System.out.println(edades[i]);
        for (int edad:edades){
            System.out.println(edad);


            }
        //podemos recorrer el array con un while

        int i = 0;

        while (i< edades.length){
            System.out.println(edades[i]);

            i++;
        }
    }
}
