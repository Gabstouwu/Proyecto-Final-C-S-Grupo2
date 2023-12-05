/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author naoal
 */
public class RegistroClienteView {

    public static Cliente crearCliente() {
        RegistrarView nuevoCliente = new RegistrarView();
        JOptionPane.showMessageDialog(null, nuevoCliente);
        Cliente crearC = nuevoCliente.crearObjetoCliente();
        System.out.println(crearC.toString());
        return crearC;
    }
}
