import java.util.ArrayList;

public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plato: ").append(nombreCompleto).append(" - Precio: $").append(precio).append("\n");
        if (!esBebida) {
            sb.append("Ingredientes:\n");
            for (Ingrediente ingrediente : ingredientes) {
                sb.append("  - ").append(ingrediente.toString()).append("\n");
            }
        } else {
            sb.append("Es una bebida\n");
        }
        return sb.toString();
    }
}
