
public class VueloCharter extends Vuelo implements Promocionable{


    private int precioTotal;

    public VueloCharter() {
     }

    public VueloCharter(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }


    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public double aplicarPromocion() {

        double descuentoFijo= 1000;

        return precioTotal - descuentoFijo;


    }




}


