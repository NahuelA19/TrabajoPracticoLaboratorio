import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
     
       System.out.println("Ingrese la cantidad de facturas:");
        
       int cantidadDefacturas = entrada.nextInt();

       Double [] facturas = new Double [cantidadDefacturas];

      for(int i =0 ; i<cantidadDefacturas; i++){

        System.out.println("Ingrese el valor de la factura " +(i+1) + ": ");

        facturas[i] = entrada.nextDouble();

      }
        calcularImpuesto(facturas);

    }



      public static void calcularImpuesto( Double [] facturas) {

        for(int i = 0; i<facturas.length; i++){

          facturas[i] = (facturas[i]+ facturas[i]*0.21);

          System.out.println("El importe de la factura " +(i+1) + " con el iva es de: " + facturas[i]);
        }
        
        
      }


}
