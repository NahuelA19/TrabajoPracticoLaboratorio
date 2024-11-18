import java.util.ArrayList;

public class Pagos {


    private ArrayList<MetodoPago>metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodo(MetodoPago metodo){
        metodosPago.add(metodo);
        System.out.println("Metodo de pago agregado");
    }

    public void realizarPagos(){
        for(MetodoPago metodos: metodosPago){
            metodos.realizarPago();
        }
    }

    public void cancelarPagos(){
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            } else {
                System.out.println("El método de pago no admite cancelación.");
            }
        }
    }




    public void mostrarPagos(){

        for(MetodoPago metodo : metodosPago){
            System.out.println("Metodo de pago: Titular - " +metodo.getTitular()+ ", Numero - " + metodo.getNumero() );
        }
    }






}
