/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Vista implements IComposite<Vista>{
    
    protected VistaPrincipal vistaSwing;

    public VistaPrincipal getVistaSwing() {
        return vistaSwing;
    }
    
    public Vista() {
        vistaSwing = new VistaPrincipal();
        vistaSwing.getjTextArea1().setText("Hola");
       vistaSwing.getjLabel().setText("Cuadro Empleado");
      vistaSwing.getjButton1().setText("Get");
      vistaSwing.getjButton2().setText("Add");
       vistaSwing.getjButton3().setText("Delete");
       String[] items = {""};
    for (int i = 0; i < items.length; i++) {
      vistaSwing.getjList1().setListData(items);
}
    
  String[] items1 = {""};
    for (int i = 0; i < items1.length; i++) {
      vistaSwing.getjList2().setListData(items1);
}  
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