package Interface;

import models.Libro;
import models.Socio;

import java.util.ArrayList;

public interface ILibrary {
    Libro libroPorISBN(String ISBN);
    Libro libroPorGenero(String genero);
    ArrayList<Socio> socioPorCodigoPostal(String codigoPostal);
    Socio socioPorNIF(String nif);
}
