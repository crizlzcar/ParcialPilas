public class Banco {

    private String nombre;
    private int cedula;
    private int credito;
    private Double cantidad;

    public Banco() {
    }

    public Banco(String nombre, int cedula, int credito, Double cantidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.credito = credito;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

   
}
