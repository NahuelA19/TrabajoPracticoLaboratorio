import java.util.Scanner;

public class SistemasDeReservas {

    public static void main(String[] args) {




        Scanner entrada = new Scanner(System.in);


       Vuelos v1 = new VueloRegular(123232,"Mexico","Argentina","19/02/1998", 150,10000);

       Vuelos v2 = new VuelosCharter(121231,"Peru","Argentina","19/02/1998",122322);



       Reservas reserva = new Reservas();

       reserva.agregarVuelos(v1);

       reserva.agregarVuelos(v2);


        System.out.println("Mostrar vuelos antes de aplicar promociones: ");

        reserva.MostrarVuelos();


        double precioTotalAntes = reserva.calcularPrecioTotal();
        System.out.println("\nPrecio total antes de promociones: " + precioTotalAntes + "€");


        reserva.aplicarPromociones();

        System.out.println("\nVuelos después de aplicar promociones:");
        reserva.MostrarVuelos();

        double precioTotalDespues = reserva.calcularPrecioTotal();
        System.out.println("\nPrecio total después de promociones: " + precioTotalDespues + "€");
    }










    }

