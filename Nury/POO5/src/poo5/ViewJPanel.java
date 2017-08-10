/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
//import javax.swing.JDialog;
//import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
/**
 *
 * @author CFP31-21
 */

public class ViewJPanel implements IView {

    @Override
    public void Draw(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    @Override
    public void Clear() {
        
    }
    
}
