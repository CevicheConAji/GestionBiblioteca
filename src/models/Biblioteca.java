package models;

import Exceptions.BookNotFoundException;
import Exceptions.MemberNotFoundException;
import Interface.ILibrary;

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
    public Libro libroPorISBN(String ISBN) {
        Libro libroISBN = null;

        for (Libro libro : librosLista) {
            if(libro.getISBN().equals(ISBN)){
                libroISBN = libro;
            }

        }
        if(libroISBN == null){
            throw new BookNotFoundException(ISBN);
        }
        return libroISBN;
    }

    @Override
    public Libro libroPorGenero(String genero) {
        Libro libroGenero = null;
        for (Libro libro : librosLista) {
            for(String genre : libro.getGeneros()){
                if(genre.equals(genero)){
                    libroGenero = libro;
                }
            }
        }
        return libroGenero;
    }

    @Override
    public ArrayList<Socio> socioPorCodigoPostal(String codigoPostal) {
        ArrayList<Socio> socios = null;
        for (Socio socio : sociosLista) {
            if(socio.getCodigoPostal().equals(codigoPostal)){
                socios = sociosLista;
            }
        }
        return socios;
    }

    @Override
    public Socio socioPorNIF(String nif) throws MemberNotFoundException {
        Socio socio = null;
        for (Socio socios : sociosLista) {
            if(socios.getNif().equals(nif)){
                socio = socios;
            }
        }
        if(socio == null){
            throw new MemberNotFoundException(nif);
        }
        return socio;
    }

}
