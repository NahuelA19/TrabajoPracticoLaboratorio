public abstract class CanalNotificacion  {
    protected String usuario;
    protected String mensaje;


    //Constructores:


    public CanalNotificacion() {
    }

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    //Getter and Setter:


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }



    public abstract void enviarNotificacion();
}
