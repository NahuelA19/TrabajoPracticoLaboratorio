import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();



        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Alumno " + (i + 1));


    
            Alumno alumno = new Alumno();

        
            System.out.print("Ingrese el nombre completo: ");
            alumno.setNombreCompleto(scanner.next());
            System.out.print("Ingrese el legajo: ");
            alumno.setLegajo(scanner.nextLong());

      
            System.out.print("Ingrese la cantidad de notas: ");
            int cantidadNotas = scanner.nextInt();

            while (cantidadNotas <= 0) {
                System.out.println("Debe ingresar al menos 1 nota.");
                System.out.print("Ingrese la cantidad de notas: ");
                cantidadNotas = scanner.nextInt();
            }

            
            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                alumno.agregarNota(new Nota("Materia " + (j + 1), nota));
            }

           
            alumnos.add(alumno);
        }

        // Mostrar la información de los alumnos y sus promedios
        System.out.println("\nInformación de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto() + " (Legajo: " + alumno.getLegajo() + ")");
            System.out.println("Notas:");
            for (Nota nota : alumno.getNotas()) {
                System.out.println("- " + nota.getCatedra() + ": " + nota.getNotaExamen());
            }
            System.out.println("Promedio: " + alumno.calcularPromedio() + "\n");
        }
    }
}
