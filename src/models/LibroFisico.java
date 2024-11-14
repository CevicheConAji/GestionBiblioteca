package models;

public class LibroFisico extends Libro {
    private String anyoEdicion;

    public LibroFisico(String ISBN, String titulo, String autor, String anyoEdicion) {
        super(ISBN, titulo, autor);
        this.anyoEdicion = anyoEdicion;
    }

    public String getAnyoEdicion() {
        return anyoEdicion;
    }

    public void setAnyoEdicion(String anyoEdicion) {
        this.anyoEdicion = anyoEdicion;
    }

    @Override
    public String toString() {
        return super.toString()+" " +this.getClass().getName() +
                " anyoEdicion='" + anyoEdicion + '\'' +
                '}';
    }
}
