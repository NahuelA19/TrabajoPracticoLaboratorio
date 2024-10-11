import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
     
       System.out.println("Ingrese la cantidad de compras:");
        
       int cantidaddeCompras = entrada.nextInt();

       Double [] compras = new Double [cantidaddeCompras];

      for(int i =0 ; i<cantidaddeCompras; i++){

        System.out.println("Ingrese el valor de la compra " +(i+1) + ": ");

        compras[i] = entrada.nextDouble();

      }
        
          aplicarDescuento(compras);
    }


    public static void aplicarDescuento(Double [] compras){
        
        for(int i=0; i<compras.length; i++){

            if(compras[i]>500){
               System.out.println("El monto de la compra "+(i+1)+ " califica para el descuento del 15%.El costo final es: " + (compras[i]+(compras[i]*0.10)));
            }

        }
        
    }
        
    }








