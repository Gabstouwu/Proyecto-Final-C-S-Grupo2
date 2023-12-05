package Controlador;
import Modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorClientes {

    public static ConexionBD conexion = new ConexionBD();
    public static ResultSet resultado = null;

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
                String contrasena = resultado.getNString("contraseña_cliente");
                printResultado += ("\n ID del cliente:" + id + "\n Nombre del cliente:" + nombre + "\n Telefono:" + telefono + "\n Correo:" + correo + "\n Fecha de nacimiento:" + fecha + "\n----------------");
            }
            JOptionPane.showMessageDialog(null, printResultado);

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarCliente(Cliente a) {

        try {

            conexion.setConexion();

            conexion.setConsulta("INSERT INTO clientes (nombre_cliente,telefono_cliente,correo_cliente,fecha_cliente,contraseña) VALUES (?,?,?,?,?) ");
            conexion.getConsulta().setString(1, a.getNombre_cliente());
            conexion.getConsulta().setString(2, a.getTelefono_cliente());
            conexion.getConsulta().setString(3, a.getCorreo_cliente());
            conexion.getConsulta().setString(4, a.getFecha_cliente());
            conexion.getConsulta().setString(5, a.getContraseña_cliente());
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

    public static void eliminarCliente(int id) {

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
