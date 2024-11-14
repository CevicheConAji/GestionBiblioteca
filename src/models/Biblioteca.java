package models;

import Interface.ILibrary;

import java.io.Serializable;
import java.util.ArrayList;

public class Biblioteca implements ILibrary {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> librosLista;
    private ArrayList<Socio> sociosLista;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        librosLista = new ArrayList<>();
        sociosLista = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getLibrosLista() {
        return librosLista;
    }

    public void setLibrosLista(ArrayList<Libro> librosLista) {
        this.librosLista = librosLista;
    }

    public ArrayList<Socio> getSociosLista() {
        return sociosLista;
    }

    public void setSociosLista(ArrayList<Socio> sociosLista) {
        this.sociosLista = sociosLista;
    }
    public void addLibro(Libro libro) {
        librosLista.add(libro);
    }
    public void addSocio(Socio socio) {
        sociosLista.add(socio);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", librosLista=" + librosLista +
                ", sociosLista=" + sociosLista +
                '}';
    }

    @Override
    public Libro libroPorISBN(int ISBN) {

        return null;
    }

    @Override
    public Libro libroPorGenero(String genero) {
        return null;
    }

    @Override
    public ArrayList<Socio> libroSocioPorCodigoPostal(int codigoPostal) {
        return null;
    }

    @Override
    public Socio socioPorNIF(String nif) {
        return null;
    }
}
