/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;

/**
 *
 * @author Gabriel
 */
public class CreacionClienteView extends javax.swing.JPanel {

    /**
     * Creates new form CreacionClienteView
     */
    public CreacionClienteView() {
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
        TituloCreacionClientes = new javax.swing.JLabel();

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

        TituloCreacionClientes.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        TituloCreacionClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCreacionClientes.setText("Creacion de clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
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
                        .addGap(99, 99, 99)
                        .addComponent(TituloCreacionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloCreacionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(InputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
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

    public Cliente crearObjetoCliente() {
        String contrasena = this.InputContrasena.getText();
        String correo = this.InputCorreo.getText();
        String fecha = this.InputFecha.getText();
        String nombre = this.InputNombre.getText();
        String telefono = this.InputTelefono.getText();
        Cliente nuevoCliente = new Cliente(nombre, telefono, correo, fecha, contrasena);
        return nuevoCliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField InputContrasena;
    private javax.swing.JTextField InputCorreo;
    private javax.swing.JTextField InputFecha;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JTextField InputTelefono;
    private javax.swing.JLabel TituloCreacionClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}