public abstract class MetodoPago {

    protected String titular;
    protected int numero;

    public MetodoPago(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    abstract void realizarPago();

}
