package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoJDBC {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO(conexion);
            PersonaDTO cambioPersona = new PersonaDTO(2, "Karla Ivone", "Gomez", "kgomez@email.com", "3333333");
            personaDao.actualizar(cambioPersona);
            
            PersonaDTO nuevaPersona = new PersonaDTO();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            personaDao.insertar(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la operación");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
    
    private static void imprimir(List<PersonaDTO> listaPersonas){
        listaPersonas.forEach(p -> System.out.println(p));
    }
}
