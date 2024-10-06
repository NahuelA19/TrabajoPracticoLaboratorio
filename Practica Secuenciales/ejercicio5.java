import java.util.Scanner;

public class ejercicio5 {

    public static void main (String[] args) {

        // Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
        //combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
        //calcule e imprima el costo total del viaje.


        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la distancia del viaje en kilometros: ");

        double distancia = entrada.nextDouble();


        System.out.println("Ingrese el consumo de combustible  del vehiculo en litros por kilometro: ");

        double consumo = entrada.nextDouble();

        System.out.println("Ingrese el costo del combustible por litro: ");

        double costo = entrada.nextDouble();


        double costoTotal = (consumo*distancia)* costo;


        System.out.println("El costo total del viaje con una distancia de " + distancia + " kilometros es " + costoTotal);

    }


}
