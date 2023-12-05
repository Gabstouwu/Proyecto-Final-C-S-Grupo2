package Vista;
import Controlador.ControladorVentas;
import Modelo.Venta;
import javax.swing.JOptionPane;
public class CreacionVentaView {
    
   // static ControladorVentas creacionVenta= new ControladorVentas();
    
    
    public static Venta crearVentaView() {
        CreacionVenta nuevaVenta = new CreacionVenta(); // nuevo jframe
        JOptionPane.showMessageDialog(null, nuevaVenta);
        Venta ventaNueva = nuevaVenta.crearObjetoVenta();
        System.out.println(ventaNueva.toString());
        return ventaNueva;
    }
    
    
}