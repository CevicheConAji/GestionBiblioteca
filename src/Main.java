/**
 * @author Piero Zavala Chira
 * @version 0.0.1
 */

import models.*;
import exceptions.*;
import java.io.*;
import java.util.*;

/**
 * Clase principal para probar la estructura de clases de la biblioteca.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testing();
    }

    /**
     * Método de prueba para inicializar datos, escribirlos en un archivo CSV,
     * leerlos y mostrarlos por pantalla.
     */
    public void testing() {
        // Crear datos iniciales
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle Principal, 123");

        biblioteca.addLibro(new LibroFisico("123-456-789", "El Quijote", "Miguel de Cervantes", "1605"));
        biblioteca.addLibro(new LibroDigital("987-654-321", "1984", "George Orwell", 5000));
        biblioteca.addLibro(new Libro("555-333-777", "La Odisea", "Homero"));
        biblioteca.addLibro(new LibroDigital("999-888-777", "Cien años de soledad", "Gabriel García Márquez", 10000));

        biblioteca.addSocio(new Socio("12345678A", "Juan", "Pérez", "001", "28001"));
        biblioteca.addSocio(new Socio("87654321B", "Ana", "López", "002", "28002"));
        biblioteca.addSocio(new Socio("12348765C", "Carlos", "Gómez", "003", "28003"));
        biblioteca.addSocio(new Socio("56781234D", "Laura", "Martínez", "004", "28004"));

        try {
            // Métodos para gestionar libros y socios
            Libro libroPorISBN = biblioteca.libroPorISBN("123-456-789");
            System.out.println("Libro encontrado por ISBN: " + libroPorISBN);

            ArrayList<Socio> sociosPorCP = biblioteca.socioPorCodigoPostal("28001");
            System.out.println("Socios encontrados por código postal: " + sociosPorCP);

        } catch (MemberNotFoundException | BookNotFoundException e) {
            System.out.println("Excepción encontrada: " + e.getMessage());
        }

        // Guardar datos en CSV
        String fileName = createCsvFileName();
        writeCsvFile(fileName, biblioteca.getLibrosLista());

        // Leer datos del CSV
        ArrayList<String> csvData = readCsvFile(fileName);
        printCsvData(csvData);
    }

    /**
     * Método que pide al usuario un nombre base y un número para generar el nombre
     * del archivo CSV.
     *
     * @return El nombre del archivo CSV generado.
     */
    public String createCsvFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre base para el fichero CSV: ");
        String baseName = scanner.nextLine();
        System.out.print("Introduce un número para el nombre del fichero CSV: ");
        int number = scanner.nextInt();
        return baseName + number + ".csv";
    }

    /**
     * Método para escribir los datos de libros en un archivo CSV.
     *
     * @param fileName Nombre del archivo CSV.
     * @param libros   Lista de libros a escribir.
     */
    public void writeCsvFile(String fileName, ArrayList<Libro> libros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("ISBN;TITULO;AUTOR;\n");
            for (Libro libro : libros) {
                writer.write(libro.getISBN() + ";" + libro.getTitulo() + ";" + libro.getAutor() + ";\n");
            }
            System.out.println("Datos escritos correctamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    /**
     * Método para leer los datos de un archivo CSV.
     *
     * @param fileName Nombre del archivo CSV.
     * @return Una lista con las líneas del archivo.
     */
    public ArrayList<String> readCsvFile(String fileName) {
        ArrayList<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return data;
    }

    /**
     * Método que imprime los datos de un ArrayList en pantalla.
     *
     * @param data Lista de datos a imprimir.
     */
    public void printCsvData(ArrayList<String> data) {
        System.out.println("Contenido del archivo CSV:");
        for (String line : data) {
            System.out.println(line);
        }
    }
}
