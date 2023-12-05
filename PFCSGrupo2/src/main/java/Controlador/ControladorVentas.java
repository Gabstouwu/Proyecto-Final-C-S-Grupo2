package Controlador;

import Modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorVentas {

    public static ConexionBD conexion = new ConexionBD();
    public static ResultSet resultado = null;

//    public static Venta crearObjetoVenta(String empleado, String cliente, String producto) {
//
//        Venta objetoTemporal = new Venta(empleado, cliente, producto);
//        return objetoTemporal;
//    }

    public static void consultarVentasCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id,id_empleado,id_cliente,id_producto from ventas");

            resultado = conexion.getResultado();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String id_E = resultado.getNString("id_empleado");
                String id_C = resultado.getNString("id_cliente");
                String id_P = resultado.getNString("id_producto");

                System.out.println("\nID:" + id + "\nEmpleado:" + id_E + "\nCliente:" + id_C + "\nProductos:" + id_P + "\n----------------");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertarVenta(Venta ventaObjeto) { //listo

        try {

            conexion.setConexion();

            conexion.setConsulta("INSERT INTO ventas (id_empleado,id_cliente,id_producto) VALUES (?,?,?)");
            conexion.getConsulta().setString(1, ventaObjeto.getId_empleado());
            conexion.getConsulta().setString(2, ventaObjeto.getId_cliente());
            conexion.getConsulta().setString(3, ventaObjeto.getId_producto());

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Ventas guardada");
            } else {

                System.out.print("Falla para poder guardar la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void actualizarVenta(String columnaAModificar, Venta ventaObjeto, String dato) {
//        //                (String columnaAModificar, String dato, String id)
//        try {
//
//            conexion.setConexion();
//
//            conexion.setConsulta("Update ventas set" + columnaAModificar + "=" + dato + "where id" + ventaObjeto.getId());
//
//            if (conexion.getConsulta().executeUpdate() > 0) {
//                System.out.print("Venta Modificada");
//            } else {
//
//                System.out.print("Falla combio de la venta");
//            }
//            conexion.cerrarConexion();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void eliminarVenta(Venta ventaObjeto) { //listo

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from ventas where id = " + ventaObjeto.getId());

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Venta Eliminada");
            } else {

                System.out.print("Falla al eliminar la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
