package models;

public class Socio {
    private String nif;
    private String nombre;
    private String apellido;
    private String numeroSocio;
    private String codigoPostal;

    public Socio(String nif, String nombre, String apellido, String numeroSocio, String codigoPostal) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSocio = numeroSocio;
        this.codigoPostal = codigoPostal;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroSocio='" + numeroSocio + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
