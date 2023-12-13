package Controlador;

import Modelo.Admin;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Producto;
import Modelo.Venta;
import Vista.CreacionClienteView;
import Vista.CreacionEmpleadoView;
import Vista.CreacionProductoView;
import Vista.CreacionVenta;
import Vista.EdicionClienteView;
import Vista.EdicionEmpleadoView;
import Vista.EdicionProductoView;
import Vista.EliminarClienteView;
import Vista.EliminarEmpleadoView;
import Vista.EliminarProductoView;
import Vista.EliminarVentaView;
import Vista.LoginView;
import javax.swing.JOptionPane;

public class ControladorView {

    public static Admin InicioDeSesion() {
        LoginView VentanaLogin = new LoginView();
        JOptionPane.showMessageDialog(null, VentanaLogin);
        Admin logIn = VentanaLogin.crearObjetoAdmin();
        return logIn;
    }

    ///------------Venta
    public static Venta crearVentaView() {
        CreacionVenta nuevaVenta = new CreacionVenta(); // nuevo jframe
        JOptionPane.showMessageDialog(null, nuevaVenta);
        Venta ventaNueva = nuevaVenta.crearObjetoVenta();
        System.out.println(ventaNueva.toString());
        return ventaNueva;
    }

    public static Venta crearVenta() {
        CreacionVenta ventanaVenta = new CreacionVenta(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaVenta);
        Venta nuevaVenta = ventanaVenta.crearObjetoVenta();
        //System.out.println(nuevoCliente.toString());
        return nuevaVenta;
    }

    public static int eliminarVentaView() {
        EliminarVentaView anularVenta = new EliminarVentaView();
        JOptionPane.showMessageDialog(null, anularVenta);
        int ventaAnulada = anularVenta.crearObjetoElimina();
        System.out.println(ventaAnulada);
        return ventaAnulada;
    }
    ///------------Cliente

    public static Cliente crearClienteView() {
        CreacionClienteView ventanaClientes = new CreacionClienteView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaClientes);
        Cliente nuevoCliente = ventanaClientes.crearObjetoCliente();
        //System.out.println(nuevoCliente.toString());
        return nuevoCliente;
    }

    public static int eliminarCliente() {
        EliminarClienteView anularCliente = new EliminarClienteView();
        JOptionPane.showMessageDialog(null, anularCliente);
        int clientAnulo = anularCliente.crearObjetoElimina();
        System.out.println(clientAnulo);
        return clientAnulo;
    }

    public static Cliente editarCliente() {
        EdicionClienteView VentanaEdicionCliente = new EdicionClienteView();
        JOptionPane.showMessageDialog(null, VentanaEdicionCliente);
        Cliente nuevoEdicionCliente = VentanaEdicionCliente.editarObjetoCliente();

        return nuevoEdicionCliente;
    }
    ///------------Producto

    public static Producto crearProducto() {
        CreacionProductoView ventanaProducto = new CreacionProductoView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaProducto);
        Producto nuevoProducto = ventanaProducto.crearObjetoProducto();
        //System.out.println(nuevoCliente.toString());
        return nuevoProducto;
    }

    public static Producto editarProducto() {
        EdicionProductoView VentanaEdicionProducto = new EdicionProductoView();
        JOptionPane.showMessageDialog(null, VentanaEdicionProducto);
        Producto nuevoEdicionProducto = VentanaEdicionProducto.editarObjetoProducto();

        return nuevoEdicionProducto;
    }

    public static int eliminarProducto() {
        EliminarProductoView anularProducto = new EliminarProductoView();
        JOptionPane.showMessageDialog(null, anularProducto);
        int productoNulo = anularProducto.crearObjetoElimina();
        System.out.println(productoNulo);
        return productoNulo;
    }

    ///------------Empleado
    public static Empleado crearEmpleadoView() {
        CreacionEmpleadoView ventanaEmpleado = new CreacionEmpleadoView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaEmpleado);
        Empleado nuevoEmpleado = ventanaEmpleado.crearObjetoEmpleado();
        //System.out.println(nuevoCliente.toString());
        return nuevoEmpleado;
    }

    public static int eliminarEmpleado() {
        EliminarEmpleadoView anularEmpleado = new EliminarEmpleadoView();
        JOptionPane.showMessageDialog(null, anularEmpleado);
        int empleadotAnulo = anularEmpleado.crearObjetoElimina();
        System.out.println(empleadotAnulo);
        return empleadotAnulo;
    }

    public static Empleado editarCEmpleado() {
        EdicionEmpleadoView VentanaEdicionEmpleado = new EdicionEmpleadoView();
        JOptionPane.showMessageDialog(null, VentanaEdicionEmpleado);
        Empleado nuevoEdicionEmpleado = VentanaEdicionEmpleado.editarObjetoEmpleado();

        return nuevoEdicionEmpleado;

    }
}
