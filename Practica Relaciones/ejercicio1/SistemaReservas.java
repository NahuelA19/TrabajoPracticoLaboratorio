import java.util.ArrayList;

public class SistemaReservas {


       public static void main(String[] args) {
           Reservas reservas = new Reservas();

           VueloRegular regular = new VueloRegular(1,"Mendoza","Nueva York","22-12-2025",150);

           VueloCharter charter = new VueloCharter(2,"Buenos Aires","Tokyo","30-02-2026",4000);


           reservas.AgregarVuelo(regular);
           reservas.AgregarVuelo(charter);



           reservas.MostrarVuelos();


           System.out.println("El precio total de la reserva es de : " + reservas.CalcularPrecioTotal());

           reservas.aplicarPromociones();
       }









}
