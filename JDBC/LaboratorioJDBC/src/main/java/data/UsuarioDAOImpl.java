package data;

import static data.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO{
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM sga.usuario";
    private static final String SQL_INSERT = "INSERT INTO sga.usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE sga.usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM sga.usuario WHERE id_usuario = ?";

    public UsuarioDAOImpl() {
    }

    public UsuarioDAOImpl(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<Usuario> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                listaUsuarios.add(new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("usuario"),
                        rs.getString("password")
                ));
            }
        } finally {
            try {
                close(rs);
                close(pstmt);
                if(this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return listaUsuarios;
    }

    @Override
    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int registrosInsertados = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            pstmt = conn.prepareStatement(SQL_INSERT);
            pstmt.setString(1, usuario.getUsuario());
            pstmt.setString(2, usuario.getPassword());
            registrosInsertados = pstmt.executeUpdate();
        } finally {
            try {
                close(pstmt);
                if(this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registrosInsertados;
    }

    @Override
    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int registrosActualizados = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            pstmt = conn.prepareStatement(SQL_UPDATE);
            pstmt.setString(1, usuario.getUsuario());
            pstmt.setString(2, usuario.getPassword());
            pstmt.setInt(3, usuario.getIdUsuario());
            registrosActualizados = pstmt.executeUpdate();
        } finally {
            try {
                close(pstmt);
                if(this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registrosActualizados;
    }

    @Override
    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int registrosEliminados = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, usuario.getIdUsuario());
            registrosEliminados = pstmt.executeUpdate();
        } finally {
            try {
                close(pstmt);
                if(this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registrosEliminados;
    }
    
}
