import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombreCompleto;

    private long legajo;

    private List<Nota> notas = new ArrayList<>();

    public Alumno(String nombreCompleto, long legajo, List<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }

    public Alumno() {
        
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    //metodo agregar notas
    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();
    }
}
