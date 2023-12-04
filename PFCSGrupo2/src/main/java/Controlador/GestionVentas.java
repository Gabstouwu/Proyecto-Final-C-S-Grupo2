package Controlador;

import Modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionVentas {

    ConexionBD conexion = new ConexionBD();
    ResultSet resultado = null;

    public Venta crearVenta(int id, String empleado, String cliente, String producto) {

        Venta objetoTemporal = new Venta(id, empleado, cliente, producto);
        return objetoTemporal;
    }

    public void consultarVentasCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id, id_empleado,id_cliente, id_producto from ventas");

            resultado = conexion.getResultado();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String id_E = resultado.getNString("Id Empleado");
                String id_C = resultado.getNString("Id Cliente");
                String id_P = resultado.getNString("Id Producto");

                System.out.println("ID " + id + "Empleado " + id_E + "Cliente" + id_C + "Productos " + id_P);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarVenta(Venta ventaObjeto) { //listo

        try {

            conexion.setConexion();

            conexion.setConsulta("INSERT INTO ventas (nombre_producto,id_producto) VALUES (?,?,?)");
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

    public void actualizarVenta(String columnaAModificar, Venta ventaObjeto, String dato) {
        //                (String columnaAModificar, String dato, String id)
        try {

            conexion.setConexion();

            conexion.setConsulta("Update ventas set" + columnaAModificar + "=" + dato + "where id" + ventaObjeto.getId());

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Venta Modificada");
            } else {

                System.out.print("Falla combio de la venta");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
