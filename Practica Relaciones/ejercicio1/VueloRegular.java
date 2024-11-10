
public class VueloRegular  extends Vuelo implements Promocionable{

    private int numeroAsientos;

    public VueloRegular() {}



    public VueloRegular(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }


    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public double calcularPrecio() {
        double precioPorAsiento = 100.0;

        return numeroAsientos * precioPorAsiento;
    }


    @Override
    public double aplicarPromocion() {
        double precioTotal = calcularPrecio();
        double descuento = 0.15;
        return precioTotal - (precioTotal * descuento);
    }
}
