package Controlador;

import Modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorVentas {

    public static ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
    public static ResultSet resultado = null;

    public static void consultarVentasCompletos() {

        try {
            conexion.setConexion();
            conexion.setConsulta("Select id, id_empleado,id_cliente,id_producto,cantidad_producto from ventas");

            resultado = conexion.getResultado();
            String printResultado = "";

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("id_empleado");
                String cliente = resultado.getString("id_cliente");
                String idProducto = resultado.getString("id_producto");
                String cantidad = resultado.getString("cantidad_producto");
                printResultado += ("\n ID de la venta : " + id + "\n ID del empleado : " + nombre + "\n Cantidad en que se compro: " + cantidad + "\n Cliente : " + cliente + "\n Id del producto : " + idProducto + "\n----------------");

            }
            JOptionPane.showMessageDialog(null, printResultado);
            conexion.cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarVenta(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from ventas where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Venta Eliminada");
            } else {

                System.out.print("Falla eliminar la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
