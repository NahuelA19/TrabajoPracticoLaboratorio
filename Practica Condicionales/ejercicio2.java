import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int contador=1;

        while (contador > 0){

            System.out.println("Ingrese el valor del producto:");

            float producto = entrada.nextFloat();

            System.out.println("Ingrese porfavor su categoria: (1: Para estudiante, 2: Para adulto, 3: Para Jubilado) ");

            String categoria = entrada.next();

            if(categoria.equals("1")){
                System.out.println("El precio del producto segun su categoria es: " + (producto - (producto*0.10)));
            }else if(categoria.equals("2")){
                System.out.println("El precio del producto segun su categoria es: " + (producto - (producto*0.05)));

            }else if(categoria.equals("3")){
                System.out.println("El precio del producto segun su categoria es: " + (producto - (producto*0.15)));

            } else{
                System.out.println("La opcion ingresada no es correcta: (Vuelva a intentarlo)");
                ++contador;
            }

           --contador;



        }


    }


}
