package mx.com.co.peliculas.negocio;

import java.util.ArrayList;
import java.util.List;
import mx.com.co.peliculas.datos.*;
import mx.com.co.peliculas.domain.Pelicula;
import mx.com.co.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    private final IAccesoDatos datos;
    
    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    

    private String obtenerNombreArchivo() {
        StringBuilder sb = new StringBuilder();
        sb.append("/Users/rav4/Cursos/Java/Programacion/catalogoPeliculas/");
        sb.append(ICatalogoPeliculas.NOMBRE_RECURSO);
        sb.append(".txt");
        return sb.toString();
    }
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            if (datos.existe(obtenerNombreArchivo())) {
                datos.escribir(pelicula, obtenerNombreArchivo(), true);
            } else {
                System.out.println("No se puede agregar una pelicula sin inicializar el catalogo");
            }
        } catch (EscrituraDatosEx ex) {
            ex.printStackTrace(System.out);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        } 
    }

    @Override
    public void listarPeliculas() {
        List<Pelicula> listaPeliculas;
        try {
            listaPeliculas = datos.listar(obtenerNombreArchivo());
            listaPeliculas.forEach(pelicula -> System.out.println("Pelicula: " + pelicula));
        } catch (LecturaDatosEx ex) {
            System.out.println("Error leyendo el catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String peliculaEncontrada = "";
        try {
            peliculaEncontrada = datos.buscar(obtenerNombreArchivo(), buscar);
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace(System.out);
        }
        if ("".equals(peliculaEncontrada)) {
            System.out.println("La pelicula no fue encontrada en el catalogo");
        } else {
            System.out.println("La pelicula fue encontrada en el catalogo");
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        String nombreArchivo = obtenerNombreArchivo();
        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                System.out.println("El catalogo se ha borrado correctamente");
            }
            datos.crear(nombreArchivo);
            System.out.println("El catalogo se ha iniciado correctamente");
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
