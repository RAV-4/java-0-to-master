package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;


public class TestManejoJDBC {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> listaPersonas = personaDao.seleccionar();
        imprimir(listaPersonas);
        
        //Insertando nuevo objeto de tipo Persona
        Persona persona = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "5575555");
        /*var registrosInsertados = personaDao.insertar(persona);
        System.out.println("registrosInsertados = " + registrosInsertados);*/
        
        //Actualizar Registro
        persona = new Persona(4, "Carlos Andres", "Esparza Zapata", "caesparza@gmail.com", "55755551");
        var registrosActualizados = personaDao.actualizar(persona);
        System.out.println("registrosActualizados = " + registrosActualizados);
        listaPersonas = personaDao.seleccionar();
        imprimir(listaPersonas);
        
        //Eliminar registro 
        persona = new Persona(4);
        var registrosEliminados = personaDao.eliminar(persona);
        System.out.println("registrosEliminados = " + registrosEliminados);
        listaPersonas = personaDao.seleccionar();
        imprimir(listaPersonas);
        
    }
    
    private static void imprimir(List<Persona> listaPersonas){
        listaPersonas.forEach(p -> System.out.println(p));
    }
}
