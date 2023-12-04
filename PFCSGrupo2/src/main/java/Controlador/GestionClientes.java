package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionClientes {

    ConexionBD conexion = new ConexionBD();
    ResultSet resultado = null;

    public void consultarClientesCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id,nombre_cliente,telefono_cliente,correo_cliente,fecha_cliente from clientes");

            resultado = conexion.getResultado();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre_cliente");
                String telefono = resultado.getNString("telefono_cliente");
                String correo = resultado.getNString("correo_cliente");
                String fecha = resultado.getNString("fecha_cliente");

                System.out.println("\n ID del cliente:" + id + "\n Nombre del cliente:" + nombre + "\n Telefono:" + telefono + "\n Correo:" + correo + "\n Fecha de nacimiento:" + fecha + "\n----------------");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarCliente( String nombre,  String telefono, String correo, String fecha, String contraseña) {

        try {

            conexion.setConexion();

            conexion.setConsulta("INSERT INTO clientes (nombre_cliente,telefono_cliente,correo_cliente,fecha_cliente,contraseña) VALUES (?,?,?,?,?) ");
            conexion.getConsulta().setString(1, nombre);
            conexion.getConsulta().setString(2, telefono);
            conexion.getConsulta().setString(3, correo);
            conexion.getConsulta().setString(4, fecha);
            conexion.getConsulta().setString(5, contraseña);
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

    public void actualizarCliente(String columnaAModificar, String dato, String id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Update clientes set " + columnaAModificar + " = " + dato + "where id " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Cliente Modificado");
            } else {

                System.out.print("Falla combio de información del cliente");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCliente(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from clientes where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.print("Cliente Eliminado");
            } else {

                System.out.print("Falla eliminar el cliente");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
