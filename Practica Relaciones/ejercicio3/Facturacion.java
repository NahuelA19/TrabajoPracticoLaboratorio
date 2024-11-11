import java.util.Scanner;

public class Facturacion {
    private static String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        // a. Solicitar datos de la factura
        System.out.print("Ingrese fecha de factura: ");
        factura.setFechaFactura(scanner.nextLine());

        System.out.print("Ingrese número de factura: ");
        long numeroFactura;
        while (true) {
            numeroFactura = scanner.nextLong();
            if (numeroFactura > 0) break;
            System.out.print("Número de factura debe ser mayor a cero. Ingrese nuevamente: ");
        }
        factura.setNumeroFactura(numeroFactura);

        scanner.nextLine(); // Consumir salto de línea
        System.out.print("Ingrese nombre del cliente: ");
        String cliente;
        while (true) {
            cliente = scanner.nextLine();
            if (!cliente.isEmpty()) break;
            System.out.print("Cliente no debe ser vacío. Ingrese nuevamente: ");
        }
        factura.setCliente(cliente);

        // b. Cargar artículos en detalle
        while (true) {
            System.out.print("Ingrese código del artículo (o 'fin' para terminar): ");
            String codigoArticulo = scanner.nextLine();

            if (codigoArticulo.equalsIgnoreCase("fin")) break;

            // Buscar artículo
            String[] articuloData = buscarArticulo(codigoArticulo);
            if (articuloData == null) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            // Pedir cantidad y calcular
            System.out.print("Ingrese cantidad a facturar: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            double precioUnitario = Double.parseDouble(articuloData[2]);
            double descuento = (cantidad > 5) ? precioUnitario * 0.1 : 0;
            double subTotal = (precioUnitario - descuento) * cantidad;

            // Crear detalle y agregar a factura
            DetalleFactura detalle = new DetalleFactura(
                    articuloData[0], articuloData[1], cantidad, precioUnitario, descuento, subTotal);
            factura.addDetalle(detalle);
        }

        // c. Calcular monto total
        factura.calcularMontoTotal();

        // d. Imprimir factura
        System.out.println("\nFactura Generada:");
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Número: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Código  Nombre   Cantidad  Precio Unitario  Descuento  Subtotal");
        for (DetalleFactura detalle : factura.getDetalles()) {
            System.out.printf("%s  %s  %d  %.2f  %.2f  %.2f\n",
                    detalle.getCodigoArticulo(),
                    detalle.getNombreArticulo(),
                    detalle.getCantidad(),
                    detalle.getPrecioUnitario(),
                    detalle.getDescuentoItem(),
                    detalle.getSubTotal());
        }
        System.out.println("Total: " + factura.getTotalCalculadoFactura());
    }

    private static String[] buscarArticulo(String codigo) {
        for (String[] articulo : articulos) {
            if (articulo[0].equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }
}

