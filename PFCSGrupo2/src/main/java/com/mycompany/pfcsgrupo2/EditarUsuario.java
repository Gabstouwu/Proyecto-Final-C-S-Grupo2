/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.pfcsgrupo2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author naoal
 */
public class EditarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarUsuario
     */
    public EditarUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        JTBuscarID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTBuscarContrasena = new javax.swing.JPasswordField();
        JBBuscarUser = new javax.swing.JButton();
        JLConfirmacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTNuevoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTNuevoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTNuevoCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTNuevaContrasena = new javax.swing.JTextField();

        jLabel1.setText("Numero de id");

        JTBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBuscarIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña");

        JTBuscarContrasena.setText("jPasswordField1");
        JTBuscarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBuscarContrasenaActionPerformed(evt);
            }
        });

        JBBuscarUser.setText("OK");
        JBBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarUserActionPerformed(evt);
            }
        });

        JLConfirmacion.setText(".");

        jLabel4.setText("Nuevo nombre");

        JTNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNuevoNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo telefono");

        JTNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNuevoTelefonoActionPerformed(evt);
            }
        });

        jLabel6.setText("Nuevo correo electronico");

        JTNuevoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNuevoCorreoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nueva contraseña");

        JTNuevaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNuevaContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(JBBuscarUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTBuscarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(JLConfirmacion)))
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(JTNuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(JTNuevoTelefono)
                            .addComponent(JTNuevoCorreo)
                            .addComponent(JTNuevaContrasena))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTBuscarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(JLConfirmacion)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(JBBuscarUser)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTBuscarIDActionPerformed

    private void JTBuscarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBuscarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTBuscarContrasenaActionPerformed

    private void JBBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarUserActionPerformed
        // TODO add your handling code here:
        String idBuscar = JTBuscarID.getText();
String contrasenaBuscar = JTBuscarContrasena.getText(); // Assuming JTBuscarContrasena is the correct field

Connection conexion = null;
PreparedStatement consulta = null;
ResultSet resultado = null;

String url = "jdbc:mysql://127.0.0.1:3306/pfcsgrupo2";
String username = "root";
String password = "ElianCortes.21";

try {
    conexion = DriverManager.getConnection(url, username, password);

    consulta = conexion.prepareStatement("SELECT id, contraseña FROM usuarios WHERE id = ?");
    consulta.setString(1, idBuscar);

    resultado = consulta.executeQuery();

    while (resultado.next()) {
        int id = resultado.getInt("id");
        String idString = String.valueOf(id);
        String contrasena = resultado.getString("contraseña");

        if (idBuscar.equals(idString) && contrasenaBuscar.equals(contrasena)) {
            String updateQuery = "UPDATE usuarios SET nombre=?, telefono=?, correo=?, contraseña=? WHERE id=?";
            consulta = conexion.prepareStatement(updateQuery);

            consulta.setString(1, JTNuevoNombre.getText());
            consulta.setString(2, JTNuevoTelefono.getText());
            consulta.setString(3, JTNuevoCorreo.getText());
            consulta.setString(4, JTNuevaContrasena.getText());
            consulta.setInt(5, id);

            int filasAfectadas = consulta.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa");
                JLConfirmacion.setText("Información cambiada con éxito!");
            } else {
                System.out.println("La actualización no tuvo éxito");
            }
        } else {
            System.out.println("Autenticación fallida");
            JLConfirmacion.setText("Autenticación fallida");
        }
    }

    System.out.println("Conexion hecha");

} catch (SQLException ex) {
    ex.printStackTrace();
} finally {
    //cierra consulta resultado y conexion
    if (resultado != null) {
        try {
            resultado.close();
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    if (consulta != null) {
        try {
            consulta.close();
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    if (conexion != null) {
        try {
            conexion.close();
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }
}
    }//GEN-LAST:event_JBBuscarUserActionPerformed

    private void JTNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNuevoNombreActionPerformed

    private void JTNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNuevoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNuevoTelefonoActionPerformed

    private void JTNuevoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNuevoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNuevoCorreoActionPerformed

    private void JTNuevaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNuevaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNuevaContrasenaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarUser;
    private javax.swing.JLabel JLConfirmacion;
    private javax.swing.JPasswordField JTBuscarContrasena;
    private javax.swing.JTextField JTBuscarID;
    private javax.swing.JTextField JTNuevaContrasena;
    private javax.swing.JTextField JTNuevoCorreo;
    private javax.swing.JTextField JTNuevoNombre;
    private javax.swing.JTextField JTNuevoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}