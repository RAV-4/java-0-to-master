package test;

import data.Conexion;
import data.IUsuarioDAO;
import data.UsuarioDAOImpl;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class testLaboratorioJDBC {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
             IUsuarioDAO iUsuarioDAO = (IUsuarioDAO) new UsuarioDAOImpl(conexion);
             Usuario usuarioActualizar = new Usuario(1, "rafapagr", "clave153");
             iUsuarioDAO.actualizar(usuarioActualizar);
             
             Usuario usuarioInsertar = new Usuario("carlapase", "carlpase");
             iUsuarioDAO.insertar(usuarioInsertar);
             
             conexion.commit();
             System.out.println("Se realizó el commit");
             
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
        
    }
    
    private static void imprimir(List<Usuario> listaUsuarios) {
        listaUsuarios.forEach(u -> System.out.println(u));
    }
}
