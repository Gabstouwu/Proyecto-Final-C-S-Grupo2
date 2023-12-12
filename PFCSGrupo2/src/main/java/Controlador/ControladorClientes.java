package Controlador;

import Modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorClientes {

    public static ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
    public static ResultSet resultado = null;

    public static void crearCliente(Cliente a) {

        try {
            conexion.setConexion();

            conexion.setConsulta("INSERT INTO clientes (nombre_cliente,telefono_cliente,correo_cliente,fecha_cliente,contraseña_cliente) VALUES (?,?,?,?,?) ");
            conexion.getConsulta().setString(1, a.getNombre_cliente());
            conexion.getConsulta().setString(2, a.getTelefono_cliente());
            conexion.getConsulta().setString(3, a.getCorreo_cliente());
            conexion.getConsulta().setString(4, a.getFecha_cliente());
            conexion.getConsulta().setString(5, a.getContraseña_cliente());
            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se creo al cliente correctamente");
            } else {

                System.out.print("Falla para poder guardar el cliente");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void consultarClientesCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id,nombre_cliente,telefono_cliente,correo_cliente,fecha_cliente,contraseña_cliente from clientes");

            resultado = conexion.getResultado();
            String printResultado = "";
            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getNString("nombre_cliente");
                String telefono = resultado.getNString("telefono_cliente");
                String correo = resultado.getNString("correo_cliente");
                String fecha = resultado.getNString("fecha_cliente");
                //String contrasena = resultado.getNString("contraseña_cliente");
                printResultado += ("\n ID del cliente: " + id + "\n Nombre del cliente: " + nombre + "\n Telefono: " + telefono + "\n Correo: " + correo + "\n Fecha de nacimiento: " + fecha + "\n----------------");
            }
            JOptionPane.showMessageDialog(null, printResultado);

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarCliente(Cliente a) {

        try {
            conexion.setConexion();

            conexion.setConsulta("UPDATE clientes SET nombre_cliente = '" + a.getNombre_cliente() + "', "
                    + "telefono_cliente = '" + a.getTelefono_cliente() + "', "
                    + "correo_cliente = '" + a.getCorreo_cliente() + "', "
                    + "fecha_cliente = '" + a.getFecha_cliente() + "', "
                    + "contraseña_cliente = '" + a.getContraseña_cliente() + "' WHERE id = " + a.getId());

            if (conexion.getConsulta().executeUpdate() > 0) {
               JOptionPane.showMessageDialog(null, "Se actualizo la informacion del cliente correctamente");

                System.out.print("Cliente Modificado");
            } else {
                System.out.print("Falla combio de información del cliente");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarCliente(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from clientes where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino al cliente correctamente");

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
