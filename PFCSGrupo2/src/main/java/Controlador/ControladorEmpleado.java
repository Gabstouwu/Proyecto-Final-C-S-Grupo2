package Controlador;

import Modelo.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorEmpleado {

    public static ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
    public static ResultSet resultado = null;

    public static void crearEmpleado(Empleado a) {

        try {
            conexion.setConexion();

            conexion.setConsulta("INSERT INTO empleados (identificacion,nombreEmpleado,edad,password) VALUES (?,?,?,?) ");
            conexion.getConsulta().setString(1, a.getIdentificacion());
            conexion.getConsulta().setString(2, a.getNombreEmpleado());
            conexion.getConsulta().setString(3, a.getEdad());
            conexion.getConsulta().setString(4, a.getPassword());
            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se creo al empleado correctamente");
            } else {

                System.out.print("Falla para poder guardar el empleado");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void consultarEmpleadosCompletos() {

        try {
            conexion.setConexion();

            conexion.setConsulta("Select id, identificacion, nombreEmpleado, edad, password from empleados");

            resultado = conexion.getResultado();
            String printResultado = "";
            while (resultado.next()) {

                int id = resultado.getInt("id");
                String identificacion = resultado.getNString("identificacion");
                String nombre = resultado.getNString("nombreEmpleado");
                String edad = resultado.getNString("edad");
                //String contrasena = resultado.getNString("contraseña_cliente");
                printResultado += ("\n ID del empleado: " + id + "\n Cedula: " + identificacion + "\n Nombre: " + nombre + "\n Edad: " + edad + "\n----------------");
            }
            JOptionPane.showMessageDialog(null, printResultado);

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarEmpleado(Empleado a) {

        try {
            conexion.setConexion();

            conexion.setConsulta("UPDATE clientes SET identificacion = '" + a.getIdentificacion() + "', "
                    + "nombreEmpleado = '" + a.getNombreEmpleado() + "', "
                    + "edad = '" + a.getEdad() + "', "
                    + "password = '" + a.getPassword() + "' "
                    + "WHERE id = " + a.getId());

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizo la informacion del empleado correctamente");

                System.out.print("Empleado Modificado");
            } else {
                System.out.print("Falla cambio de información del empleado");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarEmpleado(int id) {

        try {

            conexion.setConexion();

            conexion.setConsulta("Delete from empleado where id = " + id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino al empleado correctamente");

                System.out.print("empleado Eliminado");
            } else {

                System.out.print("Falla eliminar el empleado");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
