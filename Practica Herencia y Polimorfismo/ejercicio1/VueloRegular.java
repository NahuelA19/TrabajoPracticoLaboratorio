
public class VueloRegular extends Vuelos {
    private int numeroAsientos;
    private double precioBasePorAsiento; // Este es el precio base de cada asiento

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {

        this.precioBasePorAsiento *= 0.9;
    }
}

