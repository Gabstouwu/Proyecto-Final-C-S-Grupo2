package Vista;

import Modelo.Venta;
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

}
