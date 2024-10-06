import java.util.Scanner;

public class ejercicio2 {

     public static void main(String[] args) {

         Scanner entrada =  new Scanner(System.in);

         System.out.println("Ingrese su peso en kilogramos: ");

         double peso = entrada.nextDouble();

         System.out.println("Ingrese la duracion de su ejercicio en minutos: ");

         double duracion = entrada.nextDouble();

         System.out.println("Elija la opcion segun su tipo de entrenamiento: (1. Correr / 2.Nadar/ 3.Andar en Bicicleta) ");

         int entrenamiento = entrada.nextInt();


         switch (entrenamiento) {
             case 1:
                 double caloriasQuemadas = ((5 * peso) /200)*duracion ;
                 System.out.println("Las calorias quemadas son:  " + caloriasQuemadas);
                 break;
             case 2:
                 double caloriasQuemadas2 = ((7*peso*3.5)/200)* duracion ;
                 System.out.println("Las calorias quemadas son:  " + caloriasQuemadas2);
                 break;
            case 3:
                double caloriasQuemadas3 = ((8*peso*3.5)/200)* duracion ;
                System.out.println("Las calorias quemadas son:  " + caloriasQuemadas3);
                break ;
            default:
                System.out.println("La opcion no es correcta");
                break;
         }


     }




}
