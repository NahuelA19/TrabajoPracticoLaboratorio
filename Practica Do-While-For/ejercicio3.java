import java.util.Scanner;

public class ejercicio3 {
    
   public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     Scanner entrada1 = new Scanner(System.in);

     System.out.println("Ingrese la cantidad de productos: ");

     int cantidadProductos = entrada.nextInt();
   
     int aux = cantidadProductos;
     

     String[] productos = new String[cantidadProductos];
     int cantProducto[] = new int [cantidadProductos];
     int i=0;

     

     do{
      System.out.println("Ingrese el nombre del producto " + (i+1) + ": ");
      productos[i] = entrada1.nextLine();
      
      System.out.print("Ingrese la cantidad de " +productos[i] + " : ");
      cantProducto[i]= entrada.nextInt();
      

      if(cantProducto[i]<5){
            System.out.println("La cantidad del producto " + productos[i] +" es menor a 5. Debe realizar un pedido.");

      }
      
      ++i;
      --aux;

     } while(aux>0);
     

         

   }


}
