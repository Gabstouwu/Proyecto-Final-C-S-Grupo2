package Controlador;

import Modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorVentas {

    public static ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
    public static ResultSet resultado = null;

    public static void calculoDeVentas(Venta a) {
        conexion.setConexion();

        conexion.setConsulta("SELECT cantidad_producto FROM productos WHERE id = ?");

        try {
            // a.getId_producto() devuelve el ID del producto relacionado con la venta
            int idProducto = Integer.parseInt(a.getProducto());

            System.out.println("ID del Producto: " + idProducto);  // Imprime el ID del producto para verificar

            conexion.getConsulta().setInt(1, idProducto);

            ResultSet resultado = conexion.getResultado();

            // Verifica si hay resultados antes de intentar acceder a los datos
            if (resultado.next()) {
                int cantidadEnBodega = resultado.getInt("cantidad_producto");
                int productoVendido = a.getCantidad();

                int total = cantidadEnBodega - productoVendido;
                System.out.println("Cantidad en Bodega después de la venta: " + total);

                // Ahora, actualiza la cantidad en la bodega en la base de datos
                actualizarCantidadEnBodega(idProducto, total);
            } else {
                System.out.println("Producto no encontrado en la base de datos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public static void insertarVenta(Venta a) {
        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO ventas (id_empleado, id_cliente, id_producto, cantidad_producto) VALUES (?, ?, ?, ?)");
            conexion.getConsulta().setString(1, a.getId_empleado());
            conexion.getConsulta().setString(2, a.getId_cliente());
            conexion.getConsulta().setInt(3, a.getId_producto());
            conexion.getConsulta().setInt(4, a.getCantidad());

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Venta Guardada");

                System.out.println("Venta Guardada");

                // Después de insertar la venta, actualiza la cantidad en la bodega
                actualizarCantidadEnBodega(a.getId_producto(), a.getCantidad());
            } else {
                System.out.println("Falla para poder guardar la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarCantidadEnBodega(int idProducto, int nuevaCantidad) {
        try {
            conexion.setConexion();

            // Utiliza una sentencia preparada para actualizar la cantidad en la bodega
            conexion.setConsulta("UPDATE productos SET cantidad_producto = ? WHERE id = ?");
            conexion.getConsulta().setInt(1, nuevaCantidad);
            conexion.getConsulta().setInt(2, idProducto);

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cantidad en Bodega actualizada");

                System.out.println("Cantidad en Bodega actualizada");
            } else {
                System.out.println("Falla al actualizar la cantidad en la bodega");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

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
                JOptionPane.showMessageDialog(null, "Venta Eliminada");

                System.out.print("Venta Eliminada");
            } else {

                System.out.print("Falla eliminar la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void reporteVentas() {
        try {
            conexion.setConexion();

            conexion.setConsulta("SELECT COUNT(*) as totalFilas FROM ventas");
            resultado = conexion.getResultado();
            resultado.next();
            int totalFilas = resultado.getInt("totalFilas");

            conexion.setConsulta("SELECT SUM(cantidad_producto) as totalCantidad FROM ventas");
            resultado = conexion.getResultado();
            resultado.next();
            int totalCantidad = resultado.getInt("totalCantidad");
            String resultadoReporte = "Total de ventas: " + totalFilas + "\nTotal de productos vendidos: " + totalCantidad;

            conexion.setConsulta("Select id, id_empleado, id_cliente, id_producto, cantidad_producto from ventas");
            resultado = conexion.getResultado();
            String printResultado = "";

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("id_empleado");
                String cliente = resultado.getString("id_cliente");
                String idProducto = resultado.getString("id_producto");
                String cantidad = resultado.getString("cantidad_producto");
                printResultado += "\nID de la venta : " + id + "\nID del empleado : " + nombre + "\nCantidad en que se compró: " + cantidad + "\nCliente : " + cliente + "\nId del producto : " + idProducto + "\n----------------";
            }

            JOptionPane.showMessageDialog(null, printResultado);
            JOptionPane.showMessageDialog(null, resultadoReporte);

            conexion.cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
