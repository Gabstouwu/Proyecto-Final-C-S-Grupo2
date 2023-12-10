package Controlador;

import Modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorProductos {

    public static ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
    ResultSet resultado = null;

    public static void insertarProducto(Producto a) {

        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO productos (nombre_producto,cantidad_producto) VALUES (?,?) ");
            conexion.getConsulta().setString(1, a.getNombreProducto());
            conexion.getConsulta().setInt(2, a.getCantidad());

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

    public void consultarProductosCompletos() {
        try {
            conexion.setConexion();
            conexion.setConsulta("Select id, nombre_producto,cantidad_producto from productos");

            resultado = conexion.getResultado();
            String printResultado = "";

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre_producto");
                String cantidad = resultado.getString("cantidad_producto");
                printResultado += ("\n ID del producto: " + id + "\n Nombre del producto: " + nombre + "\n Cantidad en bodega: " + cantidad + "\n----------------");

            }
            JOptionPane.showMessageDialog(null, printResultado);
            conexion.cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarProductos(Producto a) {

        try {
            conexion.setConexion();

            conexion.setConsulta("UPDATE productos SET nombre_producto = '" + a.getNombreProducto() + "', "
                    + "cantidad_producto = " + a.getCantidad() + " WHERE id = " + a.getId());

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Producto Modificado");
            } else {
                System.out.print("Falla combio de información del producto");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarProducto(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from productos where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Producto Eliminado");
            } else {
                System.out.print("Falla eliminar el producto");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
