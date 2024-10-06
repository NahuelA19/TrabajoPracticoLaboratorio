import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese cuantas horas al dia puede estudiar: ");

        int horasEstudio = entrada.nextInt();


        System.out.println("Ingrese la cantidad de materias a preparar: ");

        int cantidadMaterias = entrada.nextInt();

        int horasEstudioXsemana = horasEstudio * 7;


        String[] nombreMaterias = new String[cantidadMaterias];
        int[] horasxMateria = new int[cantidadMaterias];


        for (int i = 0; i < cantidadMaterias; i++) {


            System.out.println("Ingrese el nombre de la materia: ");

             nombreMaterias[i] = entrada.next();


        }

        for (int i = 0; i < cantidadMaterias; i++) {
            horasxMateria[i] = horasEstudioXsemana / cantidadMaterias;


        }


        System.out.println("La cantidad de horas que tiene que dedicarle a cada materia en una semana es: ");

        System.out.println();

        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println(nombreMaterias[i] + ": " + horasxMateria[i] + " horas");
        }



    }

}