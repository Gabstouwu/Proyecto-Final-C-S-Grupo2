package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorProductos {

    ConexionBD conexion = new ConexionBD();
    ResultSet resultado = null;

    public void consultarProductosCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id, nombre_producto,id_producto from productos");

            resultado = conexion.getResultado();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre_producto");
                String id_P = resultado.getNString("id_producto");

                System.out.println("\n ID de la lista:" + id + "\n Nombre del producto:" + nombre + "\n Id del producto:" + id_P + "\n----------------");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarProducto(String nombre, String id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("INSERT INTO productos (nombre_producto,id_producto) VALUES (?,?)");
            conexion.getConsulta().setString(1, nombre);
            conexion.getConsulta().setString(2, id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Producto Guardado");
            } else {

                System.out.print("Falla para poder guardar el producto");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarProducto(String columnaAModificar, String dato, String id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Update productos set " + columnaAModificar + " = " + dato + "where id " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Producto Modificado");
            } else {

                System.out.print("Falla combio de el producto");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarProducto(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from productos where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Producto Eliminado");
            } else {

                System.out.print("Falla eliminar de el producto");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
