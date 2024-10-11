import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);

         String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

         int [] ventasDiarias = new int[7];
         int ventasTotales =0;

         for(int i = 0 ; i<7 ; i++){

           System.out.print("Ingrese las ventas del dia " + diasSemana[i]+ " : ");

           ventasDiarias[i] = entrada.nextInt();


            ventasTotales= (ventasTotales+ ventasDiarias[i]);

        
        }
    
         System.out.println("Las ventas totales de la semana fueron: " + ventasTotales + " pesos.");

    }
}
