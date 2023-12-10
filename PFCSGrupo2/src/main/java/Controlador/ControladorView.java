package Controlador;

import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Venta;
import Vista.CreacionClienteView;
import Vista.CreacionProductoView;
import Vista.CreacionVenta;
import Vista.EdicionClienteView;
import Vista.EdicionProductoView;
import Vista.EliminarView;
import javax.swing.JOptionPane;

public class ControladorView {

    // static ControladorVentas creacionVenta= new ControladorVentas();
    public static Venta crearVentaView() {
        CreacionVenta nuevaVenta = new CreacionVenta(); // nuevo jframe
        JOptionPane.showMessageDialog(null, nuevaVenta);
        Venta ventaNueva = nuevaVenta.crearObjetoVenta();
        System.out.println(ventaNueva.toString());
        return ventaNueva;
    }

    public static int eliminarVentaView() {
        EliminarView anularVenta = new EliminarView();
        JOptionPane.showMessageDialog(null, anularVenta);
        int ventaAnulada = anularVenta.crearObjetoElimina();
        System.out.println(ventaAnulada);
        return ventaAnulada;
    }

    public static Cliente crearClienteView() {
        CreacionClienteView ventanaClientes = new CreacionClienteView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaClientes);
        Cliente nuevoCliente = ventanaClientes.crearObjetoCliente();
        //System.out.println(nuevoCliente.toString());
        return nuevoCliente;
    }

    public static int eliminarCliente() {
        EliminarView anularCliente = new EliminarView();
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
        EliminarView anularProducto = new EliminarView();
        JOptionPane.showMessageDialog(null, anularProducto);
        int productoNulo = anularProducto.crearObjetoElimina();
        System.out.println(productoNulo);
        return productoNulo;
    }
}
