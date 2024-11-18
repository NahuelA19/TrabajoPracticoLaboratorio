import java.util.ArrayList;

public class Notificaciones {

    ArrayList<CanalNotificacion> canales;

    public Notificaciones(){
        this.canales = new ArrayList<>();
    }
    public void agregarCanales(CanalNotificacion canal){
       canales.add(canal);
    }


    public void enviarNotifiaciones(){
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
            System.out.println("Enviado!");
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
        }
    }

    public void personalizarMensajes(){
        for (CanalNotificacion canal : canales) {

            System.out.println("ESTE ES UN MENSAJE PERSONALIZADOOOOOOOO");

        }

    }


    public void mostrarCanales(){
        for (CanalNotificacion canal : canales) {
            System.out.println(canal.getClass());
        }
    }



}
