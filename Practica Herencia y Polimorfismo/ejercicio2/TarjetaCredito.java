import java.util.Scanner;

public class TarjetaCredito extends MetodoPago implements Cancelable {

    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }


    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void realizarPago() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Usted selecciono el pago por tarjeta de credito: ");

        System.out.println("Su nombre es: " + getTitular());
        System.out.println("Su numero es: " + getNumero());

        System.out.println("Pago realizado con exito!!");




    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con tarjeta de crédito:");
        System.out.println("Titular: " + titular);
        System.out.println("Pago cancelado exitosamente.");
    }
}
