/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author cfp31-06
 */
public class ViewJPanel implements IView {

    @Override
    public void Draw(String Texto) {
        JOptionPane.showMessageDialog(null, Texto);

    }

    @Override
    public void Clear() {

    }
    
    
    
}
