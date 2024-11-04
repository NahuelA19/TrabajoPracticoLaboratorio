public class Persona {

    private String nombre;
    private String apellido;
    private String numeroDocumentoIdentidad;
    private int añoNacimiento;
    private String pais;
    private char genero;


    public Persona() {}

    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.pais = pais;
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }



    void imprimir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Numero de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Pais = " + pais);
        System.out.println("Sexo = " + genero);

    }
}

