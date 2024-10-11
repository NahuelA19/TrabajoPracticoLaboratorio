import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
  //Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. 
  //Si han comprado más de 10 veces, reciben un 10% de descuento.

//**Instrucciones**:
//- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
//- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
//¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a pequeñas empresas y enfocados en bucles y funciones.

    Scanner entrada = new Scanner(System.in);
    Scanner entrada1 = new Scanner(System.in);
 

System.out.print("Ingrese la cantidad de clientes: ");

int cantidadClientes = entrada.nextInt();

String [] clientes = new String [cantidadClientes];

int [] compras = new int[cantidadClientes];

int [] comprasMonto = new int[cantidadClientes];


for(int i = 0 ; i<cantidadClientes; i++){

System.out.print("Ingrese el nombre del cliente " +(i+1) + " :");

 clientes[i] = entrada1.nextLine();


 System.out.print("Ingrese la cantidad  de compras realizadas por el cliente " + clientes[i] + " :");

 compras[i] = entrada.nextInt();


 System.out.println("Ingrese el monto total de las compras realizadas:");

 comprasMonto[i] = entrada.nextInt();

   calcularDescuentos(clientes, compras, comprasMonto);
}

}

 public static void  calcularDescuentos(String [] clientes,int [] compras, int [] comprasMonto ){

    for(int i = 0 ; i<clientes.length; i++ ){
      
       if(compras[i]>10){
        
         comprasMonto[i] = (int) (comprasMonto[i]-(comprasMonto[i]*0.10));
        System.out.println("El cliente " + clientes[i] + " califica para el descuento. El precio final con descuento es de: "  + comprasMonto[i]);
       }


    }

  
 }

}
