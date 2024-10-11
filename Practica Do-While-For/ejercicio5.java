import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");

        int cantidadEmpleados = entrada.nextInt();

        int cantidadHoras[] = new int[cantidadEmpleados];

        int horasExtras[]  = new int [cantidadEmpleados];


        for(int i = 0 ; i<cantidadEmpleados; i++){

            System.out.print("Ingrese la cantidad de horas trabajadas por el empleado " + (i+1) + ": ");

            cantidadHoras[i] = entrada.nextInt();

            if(cantidadHoras[i]>40){
                horasExtras[i] = (cantidadHoras[i]-40);
            }

            System.out.println("La cantidad de horas  extras trabajadas por el empleado " + (i+1) + " son: " + horasExtras[i]);
        
        }
        

    

    }
}
