import java.io.Serializable;
import java.security.Principal;
import java.sql.SQLOutput;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    //Constructor:

    public MensajeTexto() {}

    public MensajeTexto(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    //Getter and Setter:


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


    //Metodos sobrecargado:

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto");

        System.out.println("Mensaje enviado al usuario: " + getUsuario());
        System.out.println("Mensaje enviado a enviar: " + getMensaje());
        System.out.println("Al: " + getNumeroTelefono());
    }

    @Override
    public void personalizarMensaje() {
        System.out.println("Mensaje personalizado por mensaje de texto");

    }
}
