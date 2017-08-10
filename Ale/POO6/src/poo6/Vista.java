/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.List;

/**
 *
 * @author CFP31-15
 */
public class Vista implements IComposite<Vista>{
    
    protected VistaPrincipal vistaSwing;
    
    public Vista() {
        vistaSwing = new VistaPrincipal();
        vistaSwing.getjTextArea1().setText("Hola");
        vistaSwing.setVisible(true);
    }

    
    
    
    @Override
    public void Add(Vista element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Vista element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vista> getElementList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
