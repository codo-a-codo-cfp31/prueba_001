/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import javax.swing.JOptionPane;
/**
 *
 * @author @AnalistaSistok #CFP31 #SEducA
 */
public class ViewJPanel implements IView {

    @Override
    public void Draw(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    @Override
    public void Clear() {
    }
}