package Controlador;

import static Controlador.ControladorClientes.conexion;
import Modelo.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorLogIn {

   
    public static boolean verificarCredenciales(Admin tentativo) {
        
        ResultSet resultado;
        
        
        try {
            conexion.setConexion();

            String consulta = "SELECT * FROM admin WHERE nombre_usuario = ? AND contraseña_admin = ?";
            conexion.setConsulta(consulta);
            conexion.getConsulta().setString(1, tentativo.getNombre_Usuario());
            conexion.getConsulta().setString(2, tentativo.getContraseña());
                                             
            resultado = conexion.getResultado();
            

            return resultado.next();//Si "true" exite un registro, si false no exite registro 
                  
        
        } catch (SQLException e) {
            return false;
        }
    }

}
