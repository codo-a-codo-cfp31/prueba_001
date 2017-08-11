/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import javax.swing.*;
/**
 *
 * @author @AnalistaSistok 
 */
public class ViewJPanel implements IView {
  @Override
    public void draw(String text) {
       JOptionPane.showMessageDialog(null, text);
    }

    @Override
    public void clear() {
    }  
}