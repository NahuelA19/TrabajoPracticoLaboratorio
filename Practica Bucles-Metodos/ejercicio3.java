import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
    
     Scanner entrada = new Scanner(System.in);
     Scanner entrada1 = new Scanner(System.in);


     System.out.print("Ingrese la cantidad de clientes: ");

     int cantidadClientes = entrada.nextInt();

     String [] clientes = new String [cantidadClientes];

     int [] facturasPendientes = new int[cantidadClientes];

     
     for(int i = 0 ; i<cantidadClientes; i++){
     
     System.out.print("Ingrese el nombre del cliente " +(i+1) + " :");

      clientes[i] = entrada1.nextLine();


      System.out.print("Ingrese el monto de las facturas pendientes del cliente " + clientes[i] + " :");

      facturasPendientes[i] = entrada.nextInt();


      enviarFacturas(clientes, facturasPendientes, cantidadClientes);


     }



}

  public static void enviarFacturas(String nombreClientes[],int facturasPendientes[],int cantidadClientes){

     for(int i=0; i<cantidadClientes; i++){
        if(facturasPendientes[i]>500){
            System.out.println("El cliente " + nombreClientes[i] + " tiene facturas pendientes de un monto mayor a 500.");
        }
     }


  }


}
