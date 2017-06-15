/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.pkg1ro;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class El1ro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        int acum = 0;
        int num = 0;
        mensaje = JOptionPane.showInputDialog("Ingrese numero");
        num = Integer.parseInt(mensaje);
        acum = num;
        while (num != 99) {
            mensaje = JOptionPane.showInputDialog("ingrese numero");
            num = Integer.parseInt(mensaje);//paso de strig a int
            acum = acum + num;  //  acumula nu22m ingresados
            JOptionPane.showMessageDialog(null, "va sumando " + acum, "Res", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
