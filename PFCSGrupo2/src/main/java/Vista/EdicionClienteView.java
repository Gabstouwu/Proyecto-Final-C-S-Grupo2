package Vista;

import Modelo.Cliente;

/**
 *
 * @author Gabriel
 */
public class EdicionClienteView extends javax.swing.JPanel {

    /**
     * Creates new form CreacionClienteView
     */
    public EdicionClienteView() {
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

        InputContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        InputFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TituloEditarClientes = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        InputContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputContrasenaActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        InputFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFechaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de nacimiento");

        InputCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCorreoActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo electronico");

        InputTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTelefonoActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefono");

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre completo");

        TituloEditarClientes.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        TituloEditarClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloEditarClientes.setText("Edicion de cliente");

        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        jLabel6.setText("ID del cliente a modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(TituloEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(InputTelefono)
                                .addComponent(InputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(InputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputContrasenaActionPerformed

    private void InputFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputFechaActionPerformed

    private void InputCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCorreoActionPerformed

    private void InputTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTelefonoActionPerformed

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    public Cliente editarObjetoCliente() {

        String contrasena = this.InputContrasena.getText();
        String correo = this.InputCorreo.getText();
        String fecha = this.InputFecha.getText();
        String nombre = this.InputNombre.getText();
        String telefono = this.InputTelefono.getText();
        int id = Integer.parseInt(this.inputID.getText());
        Cliente nuevoCliente = new Cliente(nombre, telefono, correo, fecha, contrasena);
        nuevoCliente.setId(id);
        return nuevoCliente;
    }

//    public String idABuscar() {
//        String id = this.inputID.getText();
//        return id;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField InputContrasena;
    private javax.swing.JTextField InputCorreo;
    private javax.swing.JTextField InputFecha;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JTextField InputTelefono;
    private javax.swing.JLabel TituloEditarClientes;
    private javax.swing.JTextField inputID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
