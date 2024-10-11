import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes: ");

        int cantidadClientes = entrada.nextInt();
        
        String [] clientes = new String [cantidadClientes];

        int [] calificaciones = new int[cantidadClientes];

        for(int i = 0; i<cantidadClientes; i++){
        
            System.out.println("Ingrese su nombre: " + (i+1)+ ": ") ;

            clientes[i] = entrada1.nextLine();


            System.out.println( clientes[i]+" ingrese por favor que tan satisfecho esta del 1 al 5. (Considerando 1: Insatisfecho y 5: Muy Satisfecho): "); 

            calificaciones[i] = entrada.nextInt();




        }
 
           System.out.println("El promedio de satisfaccion de los clientes es de: " + CalcularPromedioSatisfaccion(calificaciones));
    
        }

        public static int  CalcularPromedioSatisfaccion(int [] calificaciones){
            int alm_califaciones= 0;
            int cantidad =0;

           for(int i = 0; i<calificaciones.length; i++){

              alm_califaciones =  alm_califaciones+calificaciones[i];
              ++cantidad;

           }

            int promedio = (alm_califaciones/cantidad);


        return promedio;
     }


}
