package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        //Cadena de conexion a la base de datos
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowKeyRetrieval=true";
        
        //En ciertas aplicaciones web se necesita especificar la clase con la que se conectara
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(TestMySqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            //Se crea la conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, "root", "admin123");
            //El Statement nos permite asignarle instrucciones y ejecutarlas
            Statement instruccion = conexion.createStatement();
            //Se crea el query
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
            //Resulset guarda los resultados del query
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()) {
                System.out.print("id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
