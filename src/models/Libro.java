package models;

import java.util.ArrayList;

public class Libro implements Comparable<Libro>{
    private String ISBN;
    private String titulo;
    private String autor;
    private ArrayList<String> generos;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        generos = new ArrayList<>();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }
    public void addGenero(String genero) {
        this.generos.add(genero);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", generos=" + generos +
                '}';
    }

    @Override
    public int compareTo(Libro o) {
        int tituloDiff = this.titulo.compareTo(o.titulo);
        int autorDiff = this.autor.compareTo(o.autor);

        if(tituloDiff != 0) {
            return tituloDiff;
        }
        if(autorDiff != 0) {
            return autorDiff;
        }

        return this.ISBN.compareTo(o.ISBN);
    }
}
