import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.print("¿Cuántos platos deseas ingresar? ");
        int cantidadPlatos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("\nIngresando datos para el plato #" + (i + 1));

            // Ingresar nombre y precio del plato
            System.out.print("Nombre del plato: ");
            String nombrePlato = scanner.nextLine();

            System.out.print("Precio del plato: ");
            double precioPlato = Double.parseDouble(scanner.nextLine());

            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = Boolean.parseBoolean(scanner.nextLine());

            // Crear un nuevo objeto Plato
            Plato plato = new Plato(nombrePlato, precioPlato, esBebida);

            // Si no es una bebida, pedira los ingredientes y su medida.
            if (!esBebida) {
                System.out.print("¿Cuántos ingredientes tiene este plato? ");
                int cantidadIngredientes = Integer.parseInt(scanner.nextLine());

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingresando ingrediente #" + (j + 1));

                    System.out.print("Nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.print("Cantidad: ");
                    double cantidadIngrediente = Double.parseDouble(scanner.nextLine());

                    System.out.print("Unidad de medida: ");
                    String unidadMedida = scanner.nextLine();

                    // Se agrega el igrediente a la lista.
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            // Agregar el plato al menú
            platosMenu.add(plato);
        }

        // Se muestra el menu:
        System.out.println("\n----- MENÚ DEL RESTAURANTE -----");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }
    }
}
