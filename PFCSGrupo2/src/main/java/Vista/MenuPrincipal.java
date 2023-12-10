package Vista;

import Controlador.ControladorView;
import Controlador.ControladorClientes;
import Controlador.ControladorProductos;
import Controlador.ControladorVentas;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Venta;
import javax.swing.JOptionPane;

/**
 *
 * @author naoal
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MBUsuarios = new javax.swing.JMenu();
        MostrarInfoClientes = new javax.swing.JMenuItem();
        RegistroNuevoCliente = new javax.swing.JMenuItem();
        BotonEditarUsuario = new javax.swing.JMenuItem();
        EliminarCliente = new javax.swing.JMenuItem();
        JBProductos = new javax.swing.JMenu();
        BotonMostrarProductos = new javax.swing.JMenuItem();
        BotonAgregarProducto = new javax.swing.JMenuItem();
        BotonEditarProducto = new javax.swing.JMenuItem();
        BotonEliminarProducto = new javax.swing.JMenuItem();
        EliminarVenta = new javax.swing.JMenu();
        crearVentaBoton = new javax.swing.JMenuItem();
        verVentaBoton = new javax.swing.JMenuItem();
        eliminarVentaBoton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPEscritorioLayout = new javax.swing.GroupLayout(JDPEscritorio);
        JDPEscritorio.setLayout(JDPEscritorioLayout);
        JDPEscritorioLayout.setHorizontalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        JDPEscritorioLayout.setVerticalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        MBUsuarios.setText("Clientes");

        MostrarInfoClientes.setText("Mostrar lista completa de clientes");
        MostrarInfoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInfoClientesActionPerformed(evt);
            }
        });
        MBUsuarios.add(MostrarInfoClientes);

        RegistroNuevoCliente.setText("Registrar nuevo cliente");
        RegistroNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroNuevoClienteActionPerformed(evt);
            }
        });
        MBUsuarios.add(RegistroNuevoCliente);

        BotonEditarUsuario.setText("Editar información de Cliente");
        BotonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarUsuarioActionPerformed(evt);
            }
        });
        MBUsuarios.add(BotonEditarUsuario);

        EliminarCliente.setText("Eliminar Cliente");
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        MBUsuarios.add(EliminarCliente);

        jMenuBar1.add(MBUsuarios);

        JBProductos.setText("Productos");

        BotonMostrarProductos.setText("Mostrar lista completa de productos");
        BotonMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarProductosActionPerformed(evt);
            }
        });
        JBProductos.add(BotonMostrarProductos);

        BotonAgregarProducto.setText("Agregar Producto");
        BotonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProductoActionPerformed(evt);
            }
        });
        JBProductos.add(BotonAgregarProducto);

        BotonEditarProducto.setText("Editar Producto");
        BotonEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarProductoActionPerformed(evt);
            }
        });
        JBProductos.add(BotonEditarProducto);

        BotonEliminarProducto.setText("Eliminar Producto");
        BotonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProductoActionPerformed(evt);
            }
        });
        JBProductos.add(BotonEliminarProducto);

        jMenuBar1.add(JBProductos);

        EliminarVenta.setText("Ventas");

        crearVentaBoton.setText("Crear venta");
        crearVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVentaBotonActionPerformed(evt);
            }
        });
        EliminarVenta.add(crearVentaBoton);

        verVentaBoton.setText("Ver ventas");
        verVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentaBotonActionPerformed(evt);
            }
        });
        EliminarVenta.add(verVentaBoton);

        eliminarVentaBoton.setText("Eliminar venta");
        eliminarVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVentaBotonActionPerformed(evt);
            }
        });
        EliminarVenta.add(eliminarVentaBoton);

        jMenuBar1.add(EliminarVenta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroNuevoClienteActionPerformed
        Cliente nuevoCliente = ControladorView.crearClienteView();
        ControladorClientes.crearCliente(nuevoCliente);

        //System.out.println("Usuario registrado correctamente");

    }//GEN-LAST:event_RegistroNuevoClienteActionPerformed

    private void BotonMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarProductosActionPerformed

        ControladorProductos gestionProductos = new ControladorProductos();
        gestionProductos.consultarProductosCompletos();

    }//GEN-LAST:event_BotonMostrarProductosActionPerformed


    private void BotonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProductoActionPerformed
        Producto nuevoProducto = ControladorView.crearProducto();
        ControladorProductos.insertarProducto(nuevoProducto);

    }//GEN-LAST:event_BotonAgregarProductoActionPerformed

    private void BotonEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarProductoActionPerformed

        Producto EProducto = ControladorView.editarProducto();
        ControladorProductos.actualizarProductos(EProducto);
    }//GEN-LAST:event_BotonEditarProductoActionPerformed

    private void BotonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProductoActionPerformed

        int eliminarProducto = ControladorView.eliminarProducto();
        ControladorProductos.eliminarProducto(eliminarProducto);
    }//GEN-LAST:event_BotonEliminarProductoActionPerformed

    private void BotonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarUsuarioActionPerformed

        Cliente ECliente = ControladorView.editarCliente();
        ControladorClientes.actualizarCliente(ECliente);

//        int resultado = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas editar este usuario?", "Editar Usuario", JOptionPane.YES_NO_OPTION);
//
//        // Si el usuario elige "Sí" en el mensaje de confirmación
//        if (resultado == JOptionPane.YES_OPTION) {
//            // Código para editar el usuario
//            // ...
//            // Imprimir mensaje de confirmación
//            System.out.println("Usuario editado correctamente");
//        }

    }//GEN-LAST:event_BotonEditarUsuarioActionPerformed

    private void MostrarInfoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInfoClientesActionPerformed
        ControladorClientes gestionClientes = new ControladorClientes();
        gestionClientes.consultarClientesCompletos();
    }//GEN-LAST:event_MostrarInfoClientesActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        int eliminarCliente = ControladorView.eliminarCliente();
        ControladorClientes.eliminarCliente(eliminarCliente);
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void eliminarVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {
        int eliminarVenta = ControladorView.eliminarVentaView();
       // ControladorVentas.eliminarVenta(eliminarVenta);
    }

    private void crearVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVentaBotonActionPerformed
        Venta nuevaVenta = CreacionVentaView.crearVentaView();
       // ControladorVentas.insertarVenta(nuevaVenta);

    }//GEN-LAST:event_crearVentaBotonActionPerformed

    private void verVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentaBotonActionPerformed
        ControladorVentas gestionVentas = new ControladorVentas();
        gestionVentas.consultarVentasCompletos();
    }//GEN-LAST:event_verVentaBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotonAgregarProducto;
    private javax.swing.JMenuItem BotonEditarProducto;
    private javax.swing.JMenuItem BotonEditarUsuario;
    private javax.swing.JMenuItem BotonEliminarProducto;
    private javax.swing.JMenuItem BotonMostrarProductos;
    private javax.swing.JMenuItem EliminarCliente;
    private javax.swing.JMenu EliminarVenta;
    private javax.swing.JMenu JBProductos;
    private javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenu MBUsuarios;
    private javax.swing.JMenuItem MostrarInfoClientes;
    private javax.swing.JMenuItem RegistroNuevoCliente;
    private javax.swing.JMenuItem crearVentaBoton;
    private javax.swing.JMenuItem eliminarVentaBoton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem verVentaBoton;
    // End of variables declaration//GEN-END:variables
}
