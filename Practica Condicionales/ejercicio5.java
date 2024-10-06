import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba piedra, papel o tijera: ");

        Random rand = new Random();
        String eleccion = sc.nextLine();
        String eleccionRandomST = null;

        int eleccionRandom = rand.nextInt(1, 3);

        if (eleccionRandom == 1) {
            eleccionRandomST = "piedra";

        } else if (eleccionRandom == 2) {
            eleccionRandomST = "papel";
        } else if (eleccionRandom == 3) {
            eleccionRandomST = "tijera";
        }


        System.out.println("El jugador ingreso: " + eleccion);

        System.out.println("Yo elegi: " + eleccionRandomST);





        //Si tanto el jugador como el programa eligen lo mismo:
        if (eleccion.equals("piedra") && eleccionRandomST.equals("piedra")) {
            System.out.println("Ambos seleccionaron  piedra");

        } else if (eleccion.equals("papel") && eleccionRandomST.equals("papel")) {
            System.out.println("Ambos seleccionaron  papel");
        } else if (eleccion.equals("tijera") && eleccionRandomST.equals("tijera")) {
            System.out.println("Ambos seleccionaron  tijera");
        }

        //Si el jugador elige piedra:
        if (eleccion.equals("piedra") && eleccionRandomST.equals("papel")) {
            System.out.println("Seleccionaste piedra y yo papel .Gane.");

        } else if (eleccion.equals("piedra") && eleccionRandomST.equals("tijera")) {
            System.out.println("Ganaste, elegiste piedra y yo tijera :( ");


        }

        //Si el jugador elige papel
        if (eleccion.equals("papel") && eleccionRandomST.equals("tijera")) {
            System.out.println("Seleccionaste papel y yo tijeras .Gane.");

        } else if (eleccion.equals("papel") && eleccionRandomST.equals("piedra")) {
            System.out.println("Ganaste, elegiste papel y yo piedra :( ");


        }


        //Si el jugador elige tijeras:

        if (eleccion.equals("tijera") && eleccionRandomST.equals("piedra")) {
            System.out.println("Seleccionaste tijeras y yo piedra .Gane.");

        } else if (eleccion.equals("tijera") && eleccionRandomST.equals("papel")) {
            System.out.println("Ganaste, elegiste tijeras y yo papel  :( ");


        }


    }
}


