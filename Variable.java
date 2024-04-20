package notasdeclase;

public class Variable
{
    static int myVarGlobal = 0;
    // Al usar static estamos poniendo la variable como global

        public static void main (String[] args)
        {

            // casting
            byte numByte = (short) 127;

            short numShort = 32000;

            //parse
            String notaString = "4.8";
           String edad = "25";
           float notaFloat = Float.parseFloat(notaString);
           float promNotas = (4.7f + notaFloat) / 2;



            System.out.println(promNotas);

            //scope de la variable
            if (myVarGlobal == 0)
            {
                String saludo = "hola";
                System.out.println(saludo);

            }


            // concatenar

        {

    }





    }

}
