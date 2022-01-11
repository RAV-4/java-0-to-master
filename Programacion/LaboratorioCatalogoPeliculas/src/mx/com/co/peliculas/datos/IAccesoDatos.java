package mx.com.co.peliculas.datos;

import java.util.List;
import mx.com.co.peliculas.domain.Pelicula;
import mx.com.co.peliculas.excepciones.AccesoDatosEx;
import mx.com.co.peliculas.excepciones.EscrituraDatosEx;
import mx.com.co.peliculas.excepciones.LecturaDatosEx;

public interface IAccesoDatos {
    
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreRecurso)  throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
