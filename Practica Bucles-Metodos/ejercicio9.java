import java.util.Scanner;

public class empleados9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String [] productos = {"Procesador Ryzen 5600g", "Memoria RAM DDR4 3200MHz"," Placa de video RX6600", "Motherboard B350"};

        int [] preciosOriginales = new int[productos.length];

        for(int i = 0; i<productos.length; i++){


            System.out.print("Ingrese el precio del producto " +productos[i] +": ");

            preciosOriginales[i] = entrada.nextInt();

           

        }

        calcularPrecioFinal(productos, preciosOriginales);
    }

        public static void calcularPrecioFinal(String [] productos, int [] preciosOriginales) {

            System.out.println("Precios finales: ");
            System.out.println("////////////////////////////////");
            
            for(int i = 0; i<productos.length; i++){
                System.out.print("El precio final del producto " +productos[i] + " es: " +(preciosOriginales[i]+(preciosOriginales[i]*0.10)) ) ;
                System.out.println();
            }
            
        }

}
