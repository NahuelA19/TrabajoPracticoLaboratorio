import java.util.Scanner;

public class ejercicio1{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int ventas[] = new int [30];
        
        

        for(int i =0; i<30; i++){
 
            System.out.println("Ingrese la cantidad de ventas del dia " +(i+1) + ": ");
           
            ventas[i] = entrada.nextInt();
        
        }
        

            System.out.println("La cantidad de ventas totales en los 30 dias fue de: " + calcularIngresosMensuales(ventas));
    }


     public static int calcularIngresosMensuales(int [] array){
            int ventastotales=0;

           for(int i=0 ; i<array.length; i++){
              ventastotales= ventastotales+array[i];
           }



          return ventastotales;
     } 
     
}