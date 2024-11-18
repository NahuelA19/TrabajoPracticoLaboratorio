public class SistemadePagos {

    public static void main(String[] args) {

        Pagos pagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("N",12312,"13123",123);

        pagos.agregarMetodo(tarjeta);


        System.out.println("Informacion de metodos de pago: ");

        pagos.mostrarPagos();


        System.out.println("Realizando pagos: ");

        pagos.realizarPagos();


        System.out.println("Cancelar pagos: ");
        pagos.cancelarPagos();


        

    }




}
