import java.util.Scanner;

public class ejercicio7 {

    //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
    //recomiende una actividad basada en su estado de ánimo.



   public static void main (String[] args) {

       Scanner entrada = new Scanner (System.in);
       System.out.println("Ingrese por favor la opcion que mas se aproxime a su estado de animo: (feliz,triste,energico o relajado) ");


       String estadoAnimo = entrada.nextLine();


       if(estadoAnimo.equals("feliz")){

           System.out.println("Puedes planear algo con amigos o hacer algo que te mantenga en ese estado.");
       } else if (estadoAnimo.equals("triste")){

           System.out.println( "Puedes buscar con quien hablar o alguna actividad que te guste o mantenga ocupado");

       } else if (estadoAnimo.equals("energico")){

           System.out.println("Puedes aprovechar tu estado de animo energico para hacer tareas pendientes que requieran esa energia extra.");
       } else if (estadoAnimo.equals("relajado")) {

           System.out.println("Si quieres seguir relajado puedes hacerte un te o leer algo .");

       }


   }


}
