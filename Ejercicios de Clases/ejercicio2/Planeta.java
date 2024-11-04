enum TipoPlaneta {
    GASEOSO,
    TERRESTRE,
    ENANO
}

public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol =0;
    private TipoPlaneta tipoPlaneta;
    boolean esObsevable = false;
    private int periodioOrbital =0;
    private int periododeRotacion =0;


    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipoPlaneta, int periodioOrbital, boolean esObsevable, int periododeRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.periodioOrbital = periodioOrbital;
        this.esObsevable = esObsevable;
        this.periododeRotacion = periododeRotacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public TipoPlaneta getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta(TipoPlaneta tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }

    public boolean isEsObsevable() {
        return esObsevable;
    }

    public void setEsObsevable(boolean esObsevable) {
        this.esObsevable = esObsevable;
    }

    public int getPeriodioOrbital() {
        return periodioOrbital;
    }

    public void setPeriodioOrbital(int periodioOrbital) {
        this.periodioOrbital = periodioOrbital;
    }

    public int getPeriododeRotacion() {
        return periododeRotacion;
    }

    public void setPeriododeRotacion(int periododeRotacion) {
        this.periododeRotacion = periododeRotacion;
    }


    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " millones de km");
        System.out.println("Tipo: " + tipoPlaneta);
        System.out.println("Observable: " + esObsevable);
        System.out.println("Periodio Orbital: " + periodioOrbital);
        System.out.println("Periodode Rotacion: " + periododeRotacion);
    }

    public double calcularDensidad() {
        if (volumen == 0) {
            return 0;
        }
        return masa / volumen;
    }


    public boolean esPlanetaExterior() {
        double distanciaEnKm = distanciaSol * 1_000_000;
        double distanciaUA = distanciaEnKm / 149_597_870;
        return distanciaUA > 3.4;
    }


}
