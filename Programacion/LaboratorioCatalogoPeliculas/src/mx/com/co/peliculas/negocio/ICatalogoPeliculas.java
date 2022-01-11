package mx.com.co.peliculas.negocio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "Peliculas";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
