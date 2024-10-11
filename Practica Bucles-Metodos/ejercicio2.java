import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);

       Scanner entrada1 = new Scanner(System.in);
         
       System.out.println("Ingrese la cantidad de productos: ");

       int cantidadProductos= entrada.nextInt();
 
       String productos[] = new String [cantidadProductos];


       int [] cantidadelProducto = new int [cantidadProductos];


        for(int i = 0; i<cantidadProductos; i++){
 

           System.out.println("Ingrese el nombre del producto " + (i+1)+ " :");

           productos[i] = entrada1.nextLine();


           System.out.println("Ingrese la cantidad del producto " + productos[i] + " :");

           cantidadelProducto[i] = entrada.nextInt();

       

        }
   

          generarReporteBajoStock(productos, cantidadelProducto);


    }
    

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }




}
