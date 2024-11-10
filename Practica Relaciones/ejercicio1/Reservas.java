import java.util.ArrayList;


public class Reservas {

    private ArrayList<Vuelo> vuelos;


    public Reservas() {

        vuelos = new ArrayList<>();
    }

    public void AgregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double CalcularPrecioTotal() {
        double precioTotal = 0;
        for (Vuelo vuelo : vuelos) {
            precioTotal += vuelo.calcularPrecio();
        }

        return precioTotal;

    }

    //Aplicar promos solo si el vuelo es promocionable
    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {

            if (vuelo instanceof Promocionable) {
                Promocionable promocionableVuelo = (Promocionable) vuelo;
                double precioConPromocion = promocionableVuelo.aplicarPromocion();
                System.out.println("Precio con promoción para el vuelo " + vuelo.numeroVuelo + ": " + precioConPromocion);
            }


        }
    }




    public void MostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("EL numero del vuelo " + vuelo.numeroVuelo);
            System.out.println("Su origen es: " + vuelo.origen);
            System.out.println("Su destino es: " + vuelo.destino);
            System.out.println("La fecha del vuelo es: " + vuelo.fecha);
            System.out.println("El precio del vuelo es: " + vuelo.calcularPrecio());

            System.out.println(".............................................................................");
        }



    }




}