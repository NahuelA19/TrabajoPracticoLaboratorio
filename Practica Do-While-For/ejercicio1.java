
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main (String [] args){
        int contador = 4;
        int i=0;
        int j=0;
        int total=0;
        Scanner entrada = new Scanner(System.in);
        
        String[] lista = {"estudia", "hace ejercicios", "lee", " tiene tiempo libre"};
        
        int [] actividades = new int[4];

        
        while(contador>0){
  
            System.out.println("Ingrese la cantidad de horas que " + lista[i]);
            
             ++i;
            
            --contador;
            
            actividades[j] = entrada.nextInt();
            
            total= total+actividades[j];
            
            ++j;
            
            
            
            
            
            
        }
        
        System.out.println("La cantidad de horas en total destinadas a distintas actividades es: " + total);
        
    }
    
}
