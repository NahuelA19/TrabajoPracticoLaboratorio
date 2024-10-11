import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String [] empleados = {"Raul","Tito","Jose","Nahuel"};

        int [] horasTrabajadas = new int [empleados.length];
 
        
        for(int i = 0; i<empleados.length; i++){
        System.out.println("Ingrese la cantidad de horas trabajadas del empleado " + empleados[i] + " :");
           horasTrabajadas[i] = entrada.nextInt();

           
           }

           calcularPagoSemanal(horasTrabajadas, empleados);
    }

      public static void calcularPagoSemanal(int [] horasTrabajadas, String [] empleados){
        int salario =15;

        for(int i=0; i<empleados.length; i++){
            System.out.println("El salario del empleado " + empleados[i] + " es de: " + (salario*horasTrabajadas[i]));

        }
      }



}


