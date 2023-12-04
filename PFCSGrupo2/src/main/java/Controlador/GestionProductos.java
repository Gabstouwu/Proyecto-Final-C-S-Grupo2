package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionProductos {

    ConexionBD conexion = new ConexionBD();
    ResultSet resultado = null;

    public void consultarProductosCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id, nombre_producto,id_producto from productos");

            resultado = conexion.getResultado();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("Nombre");
                String id_P = resultado.getNString("Id Producto");

                System.out.println("ID " + id + "Nombre " + nombre + "id_P " + id_P);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
