package test;

import datos.Conexion;
import datos.PersonaDAOJDBC;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import datos.IPersonaDAO;

public class TestManejoJDBC {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            IPersonaDAO personaDao = new PersonaDAOJDBC(conexion);
            List<PersonaDTO> listaPersonas = personaDao.select();
            imprimir(listaPersonas);
            
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

