package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class ConexionBaseDeDatos {

    //Datos de gestion de BD
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;

    //Parametros de inicializacion de BD
    String url = "jdbc:mysql://127.0.0.1:3306/basedatostienda";
    String username = "root";
    String password = "HsM+sO4789S5";

    public void setConexion() {
        try {
            //Class.forName("com.mysql.jdbc.Driver"); 
            this.conexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

    public void setConsulta(String sql) {
        try {
            this.consulta = conexion.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement getConsulta() {
        return consulta;
    }

    public ResultSet getResultado() {
        try {
            return consulta.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cerrarConexion() {

        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
