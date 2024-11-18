

public class VuelosCharter extends Vuelos implements Promocionable {

    private int precioTotal;

    public VuelosCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        // Aplicar promoción específica para vuelos charter
        this.precioTotal *= 0.85; // Ejemplo: 15% de descuento
    }

    public double calcularPrecio(
    ) {

        return precioTotal;
    }



}
