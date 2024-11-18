public class Paypal  extends MetodoPago implements Cancelable{

    private String correoElectronico;

    public Paypal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    void realizarPago() {
        System.out.println("Realizando Pago por paypal ");

        System.out.println("Titular: " + getTitular());
        System.out.println("Correo: " + getCorreoElectronico());

        System.out.println("Pago realizado con exito");

    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con paypal :");
        System.out.println("Titular: " + titular);
        System.out.println("Correo: " + correoElectronico);
        System.out.println("Pago cancelado exitosamente.");
    }
}
