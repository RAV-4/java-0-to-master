package cpjlaboratorioFinal;

import java.util.Scanner;
import mx.com.co.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.co.peliculas.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {
    private static Scanner entradaTeclado;
    private static int opcion;
    private static final ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al catalogo de peliculas");
        
        
        entradaTeclado = new Scanner(System.in);
        
        String nombrePelicula;
        do{
            System.out.println("");
            System.out.println("Elija una opcion:");
            System.out.println("1. Iniciar Catalogo de peliculas");
            System.out.println("2. Agregar Pelicula");
            System.out.println("3. Listar Peliculas");
            System.out.println("4. Buscar Peliculas");
            System.out.println("0. Salir");
            System.out.println("");
            opcion = Integer.parseInt(entradaTeclado.nextLine());
            
            switch(opcion) {
                case 1 -> catalogoPeliculas.iniciarCatalogoPeliculas();
                case 2 -> {
                    System.out.println("Ingresa el nombre de la pelicula");
                    nombrePelicula = entradaTeclado.nextLine();
                    catalogoPeliculas.agregarPelicula(nombrePelicula);
                }
                case 3 -> {
                    System.out.println("Peliculas existentes en el catalogo");
                    catalogoPeliculas.listarPeliculas();
                }
                case 4 -> {
                    System.out.println("Ingrese el nombre de la pelicula a buscar");
                    nombrePelicula = entradaTeclado.nextLine();
                    catalogoPeliculas.buscarPelicula(nombrePelicula);
                }
                case 0 -> System.out.println("Adios");
                default -> System.out.println("Ingrese una opcion valida");

            }
            System.out.println("");
        }while(opcion != 0);
        
        
    }
    
}
