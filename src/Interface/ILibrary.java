package Interface;

import models.Libro;
import models.Socio;

import java.util.ArrayList;

public interface ILibrary {
    Libro libroPorISBN(int ISBN);
    Libro libroPorGenero(String genero);
    ArrayList<Socio> libroSocioPorCodigoPostal(int codigoPostal);
    Socio socioPorNIF(String nif);
}
