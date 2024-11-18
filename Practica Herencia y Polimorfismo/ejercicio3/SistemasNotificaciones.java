public class SistemasNotificaciones  {
    public static void main(String[] args) {

        CorreoElectronico c1 = new CorreoElectronico("A","Hola X CORREO","agustinahuelaciar@gmail.com");

        MensajeTexto m1 = new MensajeTexto("Tito","Hola x MSJ","2613223121");


        Notificaciones n1 = new Notificaciones();

        n1.agregarCanales(c1);

        n1.agregarCanales(m1);

        System.out.println(".....................................................................................");

        n1.personalizarMensajes();
        System.out.println(".....................................................................................");

        n1.mostrarCanales();

        System.out.println(".....................................................................................");
        n1.enviarNotifiaciones();


    }
}
