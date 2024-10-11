/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ejercicio2 {
    public static void main (String [] args){
        //Una empresa desea calcular el salario semanal de sus empleados 
        //basándose en las horas trabajadas y una tarifa fija por hora.
        int i =0;
        int tarifaFija = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de empleados:");
       
        int cantidadEmpleados= entrada.nextInt();
        
        int aux = cantidadEmpleados;
        
        
        
        System.out.println("Ingrese la tarifa fija por hora:");
        tarifaFija = entrada.nextInt();
        
        String nombreEmpleado[] = new String[cantidadEmpleados];
        int horasTrabajadasEmpleado[] = new int [cantidadEmpleados];
        
        while(aux>0){
            
        System.out.println("Ingrese el nombre  del empleado " +(i+1) + ":");
        nombreEmpleado[i] = entrada.next();
        
        System.out.println("Ingrese la cantidad de horas trabajadas del empleado " +(i+1) + ":");
        
        horasTrabajadasEmpleado[i] = entrada.nextInt();
        
        
            System.out.println("El empleado " + nombreEmpleado[i] + " gano: " + (horasTrabajadasEmpleado[i]*tarifaFija));
        
            --aux;
            ++i;
        }
  
        
        
    }
}
