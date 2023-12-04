/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.pfcsgrupo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author naoal
 */
public class MostrarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form MostrarUsuario
     */
    public MostrarUsuario() {
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
        JTBusquedaID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAMostrar = new javax.swing.JTextArea();
        JBMostrar = new javax.swing.JButton();

        jLabel1.setText("ID del usuario a mostrar");

        JTAMostrar.setColumns(20);
        JTAMostrar.setRows(5);
        jScrollPane1.setViewportView(JTAMostrar);

        JBMostrar.setText("Mostrar");
        JBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTBusquedaID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(JBMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTBusquedaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(JBMostrar)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarActionPerformed
        // TODO add your handling code here:
        String idBuscar = JTBusquedaID.getText();
        Connection conexion = null;
        Statement consulta = null;
        ResultSet resultado = null;

        String url = "jdbc:mysql://127.0.0.1:3306/pfcsgrupo2";
        String username = "root";
        String password = "ElianCortes.21";

        try {
            conexion = DriverManager.getConnection(url, username, password);
            consulta = conexion.createStatement();

            // Consulta para obtener la lista de usuarios
            String selectQuery = "SELECT id, nombre, telefono, correo, fechaNacimiento FROM usuarios";
            resultado = consulta.executeQuery(selectQuery);

            // Iterar a través del resultado y agregar elementos al modelo de lista
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String idString = String.valueOf(id);
                String nombreString = resultado.getString("nombre");
                String telefonoString = resultado.getString("telefono");
                String correoString = resultado.getString("correo");
                String fechaString = resultado.getString("fechaNacimiento");

                if (idBuscar.equals(idString)) {
                    JTAMostrar.setText("ID; " + idString + "\n"
                            + "Nombre: " + nombreString + "\n"
                            + "Telefono: " + telefonoString + "\n"
                            + "Correo: " + correoString+ "\n"
                            + "Fecha de Nacimiento: " + fechaString + "\n");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Cerrar recursos en el bloque finally
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
    }//GEN-LAST:event_JBMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMostrar;
    private javax.swing.JTextArea JTAMostrar;
    private javax.swing.JTextField JTBusquedaID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
