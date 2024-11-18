import java.io.Serializable;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {

    private String direccionCorreo;

    //Constructores:
    public CorreoElectronico(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    //Getter and Setter:


    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    //Metodos sobrecargados:
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje por correoelectronico");
        System.out.println("Mensaje enviado al usuario: " + getUsuario());
        System.out.println("Mensaje a enviar: " + getMensaje());
        System.out.println("Direecion a enviar: " + getDireccionCorreo());

    }

    @Override
    public void personalizarMensaje() {

        System.out.println("Personalizando mensaje por correoelectronico");


    }
}
