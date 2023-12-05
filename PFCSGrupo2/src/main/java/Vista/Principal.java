package Vista;

import Controlador.GestionClientes;
import Controlador.GestionProductos;
import Controlador.ControladorVentas;
import Modelo.Venta;
import javax.swing.JOptionPane;

/**
 *
 * @author naoal
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        MIRegistroUsuario = new javax.swing.JMenuItem();
        MIEditarUsuario = new javax.swing.JMenuItem();
        MIMostrarUsuario = new javax.swing.JMenuItem();
        MIEliminarUsuario = new javax.swing.JMenuItem();
        JBProductos = new javax.swing.JMenu();
        JMIMostrarProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        VentaBoton = new javax.swing.JMenu();
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

        MIRegistroUsuario.setText("Registro de usuarios");
        MIRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIRegistroUsuarioActionPerformed(evt);
            }
        });
        MBUsuarios.add(MIRegistroUsuario);

        MIEditarUsuario.setText("Editar información de Cliente");
        MIEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEditarUsuarioActionPerformed(evt);
            }
        });
        MBUsuarios.add(MIEditarUsuario);

        MIMostrarUsuario.setText("Mostrar información clientes");
        MIMostrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIMostrarUsuarioActionPerformed(evt);
            }
        });
        MBUsuarios.add(MIMostrarUsuario);

        MIEliminarUsuario.setText("Eliminar Cliente");
        MIEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEliminarUsuarioActionPerformed(evt);
            }
        });
        MBUsuarios.add(MIEliminarUsuario);

        jMenuBar1.add(MBUsuarios);

        JBProductos.setText("Productos");

        JMIMostrarProductos.setText("Mostrar Productos");
        JMIMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIMostrarProductosActionPerformed(evt);
            }
        });
        JBProductos.add(JMIMostrarProductos);

        jMenuItem1.setText("Agregar Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JBProductos.add(jMenuItem1);

        jMenuItem2.setText("Editar Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JBProductos.add(jMenuItem2);

        jMenuItem3.setText("Eliminar Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        JBProductos.add(jMenuItem3);

        jMenuBar1.add(JBProductos);

        VentaBoton.setText("Ventas");

        crearVentaBoton.setText("Crear venta");
        crearVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVentaBotonActionPerformed(evt);
            }
        });
        VentaBoton.add(crearVentaBoton);

        verVentaBoton.setText("Ver ventas");
        verVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentaBotonActionPerformed(evt);
            }
        });
        VentaBoton.add(verVentaBoton);

        eliminarVentaBoton.setText("Eliminar venta");
        eliminarVentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVentaBotonActionPerformed(evt);
            }
        });
        VentaBoton.add(eliminarVentaBoton);

        jMenuBar1.add(VentaBoton);

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

    private void MIRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIRegistroUsuarioActionPerformed
        // TODO add your handling code here:
        
    
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
    String telefono = JOptionPane.showInputDialog("Ingrese el teléfono: ");
    String email = JOptionPane.showInputDialog("Ingrese el email: ");
    String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
    String password = JOptionPane.showInputDialog("Ingrese la contraseña: ");

    GestionClientes gestionClientes = new GestionClientes();
    gestionClientes.insertarCliente(nombre, telefono, email, fechaNacimiento, password);

    System.out.println("Usuario registrado correctamente");

    }//GEN-LAST:event_MIRegistroUsuarioActionPerformed

    private void JMIMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIMostrarProductosActionPerformed
        // TODO add your handling code here:
        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.consultarProductosCompletos();

    }//GEN-LAST:event_JMIMostrarProductosActionPerformed


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.insertarProducto("huevo","002");    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.actualizarProducto("2","Leche","022");     }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.eliminarProducto(6);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MIEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEditarUsuarioActionPerformed
        // TODO add your handling code here:
          int resultado = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas editar este usuario?", "Editar Usuario", JOptionPane.YES_NO_OPTION);

    // Si el usuario elige "Sí" en el mensaje de confirmación
    if (resultado == JOptionPane.YES_OPTION) {
        // Código para editar el usuario
        // ...
        // Imprimir mensaje de confirmación
        System.out.println("Usuario editado correctamente");
    }

    }//GEN-LAST:event_MIEditarUsuarioActionPerformed

    private void MIMostrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIMostrarUsuarioActionPerformed
        GestionClientes gestionClientes = new GestionClientes();
        gestionClientes.consultarClientesCompletos();
    }//GEN-LAST:event_MIMostrarUsuarioActionPerformed

    private void MIEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEliminarUsuarioActionPerformed
        // TODO add your handling code here:
       GestionClientes gestionClientes = new GestionClientes();
        gestionClientes.eliminarCliente(1);
    }//GEN-LAST:event_MIEliminarUsuarioActionPerformed

    private void eliminarVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVentaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarVentaBotonActionPerformed

    private void crearVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVentaBotonActionPerformed
        Venta nuevaVenta = CreacionVentaView.crearVentaView();
        ControladorVentas.insertarVenta(nuevaVenta);
        
    }//GEN-LAST:event_crearVentaBotonActionPerformed

    private void verVentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentaBotonActionPerformed
        ControladorVentas gestionVentas = new ControladorVentas();
        gestionVentas.consultarVentasCompletos();       
    }//GEN-LAST:event_verVentaBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JBProductos;
    private javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenuItem JMIMostrarProductos;
    private javax.swing.JMenu MBUsuarios;
    private javax.swing.JMenuItem MIEditarUsuario;
    private javax.swing.JMenuItem MIEliminarUsuario;
    private javax.swing.JMenuItem MIMostrarUsuario;
    private javax.swing.JMenuItem MIRegistroUsuario;
    private javax.swing.JMenu VentaBoton;
    private javax.swing.JMenuItem crearVentaBoton;
    private javax.swing.JMenuItem eliminarVentaBoton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem verVentaBoton;
    // End of variables declaration//GEN-END:variables
}
