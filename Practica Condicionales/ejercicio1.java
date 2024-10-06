import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 1;



        while(contador>0){

            System.out.println("Seleccione una opcion para un genero de pelicula: (1 : Para accion, 2: para comedia, 3: para drama, 4: para ciencia ficcion.");
            String opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Selecciono la categoria accion: Se le recomienda la pelicula: Ciudad de Dios");
                    --contador;
                    break;
                case "2":
                    System.out.println("Selecciono la categoria comedia: Se le recomienda la pelicula: Noche de Juegos");
                    --contador;
                    break;
                case "3":
                    System.out.println("Selecciono la categoria drama: Se le recomienda la pelicula:  El padrino ");
                    --contador;
                    break;
                case "4":
                    System.out.println("Selecciono la categoria ciencia ficcion: Se le recomienda la pelicula: Blade Runner ");
                    --contador;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }



        }
    }
















        }


