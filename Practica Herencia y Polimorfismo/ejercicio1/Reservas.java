import java.util.ArrayList;
import java.util.List;

 class Reservas {

    private List<Vuelos> vuelos;

    //Carga las reservas en el array list vuelos.
     public Reservas() {
         this.vuelos = new ArrayList<Vuelos>();
     }

     //Agregar vuelos:
    public void agregarVuelos(Vuelos vuelo) {
        vuelos.add(vuelo);
    }




    public double calcularPrecioTotal() {

        double total = 0.0;

        for (Vuelos vuelo : vuelos) {

            total+=vuelo.calcularPrecio();
        }
        return total;
    }

     public void aplicarPromociones() {
         for (Vuelos vuelo : vuelos) {
             vuelo.aplicarPromocion();
         }
     }




     //Muestra los vuelos:

    public void MostrarVuelos() {
        for (Vuelos v : vuelos) {
            System.out.println(v.toString());

        }
    }



 }
