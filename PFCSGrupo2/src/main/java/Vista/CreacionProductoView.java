/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Producto;

/**
 *
 * @author Gabriel
 */
public class CreacionProductoView extends javax.swing.JPanel {

    /**
     * Creates new form CreacionProductoView
     */
    public CreacionProductoView() {
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

        TituloInsertarProducto = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        InputCantidad = new javax.swing.JTextField();
        DigiteNombre = new javax.swing.JLabel();
        DigiteCantidad = new javax.swing.JLabel();

        TituloInsertarProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        TituloInsertarProducto.setText("Insertar producto");

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });

        DigiteNombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        DigiteNombre.setText("Digite el nombre del producto");

        DigiteCantidad.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        DigiteCantidad.setText("Digite la cantidad del producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DigiteCantidad)
                    .addComponent(DigiteNombre)
                    .addComponent(InputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloInsertarProducto))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TituloInsertarProducto)
                .addGap(27, 27, 27)
                .addComponent(DigiteNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DigiteCantidad)
                .addGap(3, 3, 3)
                .addComponent(InputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    public Producto crearObjetoProducto() {
        int cantidad = Integer.parseInt(this.InputCantidad.getText());
        String nombre = this.InputNombre.getText();
        Producto nuevoProducto = new Producto(nombre, cantidad);
        return nuevoProducto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DigiteCantidad;
    private javax.swing.JLabel DigiteNombre;
    private javax.swing.JTextField InputCantidad;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JLabel TituloInsertarProducto;
    // End of variables declaration//GEN-END:variables
}
