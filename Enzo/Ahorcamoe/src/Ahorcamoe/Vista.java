package Ahorcamoe;

import java.util.List;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Vista implements IComposite<Vista>{
    protected Main vistaSwing;
    
 public Main getVistaSwing() {
        return vistaSwing;
    }
    
public Vista() {
        vistaSwing = new Main();
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

    Object getjButton2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Netbeans {
 private static Icon png;
 public Netbeans() {
        }
    }

    private static class seduca {
 private static Icon png;
 public seduca() {
        }
    }

    private static class Logo {
 private static Icon jpg;
 public Logo() {
        }
    }

    private static class codoacodo {
 private static Icon png;
  public codoacodo() {
        }
    }
}           