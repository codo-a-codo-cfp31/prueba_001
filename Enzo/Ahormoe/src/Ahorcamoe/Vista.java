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
       vistaSwing.getjButton2().setText("B");
       vistaSwing.getjButton3().setText("B");
       vistaSwing.getjButton4().setText("C");
       vistaSwing.getjButton5().setText("D");
       vistaSwing.getjButton6().setText("E");
                vistaSwing.getjButton7().setText("D");  
                vistaSwing.getjButton8().setText("E");
                  vistaSwing.getjButton9().setText("F");  
                  vistaSwing.getjButton10().setText("G"); 
                  vistaSwing.getjButton6().setText("H");
                    vistaSwing.getjButton7().setText("J");  
                    vistaSwing.getjButton8().setText("K");
                      vistaSwing.getjButton9().setText("L");
                    vistaSwing.getjButton10().setText("Ñ");  
                    vistaSwing.getjButton11().setText("Z"); 
                    vistaSwing.getjButton12().setText("X");
                      vistaSwing.getjButton13().setText("C");
                      vistaSwing.getjButton14().setText("V");  
                      vistaSwing.getjButton15().setText("B");
                        vistaSwing.getjButton16().setText("N");  
                        vistaSwing.getjButton17().setText("N");  
                        vistaSwing.getjButton18().setText("M");
                          vistaSwing.getjButton19().setText("Q");
                          vistaSwing.getjButton20().setText("W");    
                            vistaSwing.getjButton21().setText("E");
                            vistaSwing.getjButton22().setText("R");
                              vistaSwing.getjButton23().setText("T"); 
                              vistaSwing.getjButton24().setText("Y");  
                              vistaSwing.getjButton25().setText("U");  
                              vistaSwing.getjButton26().setText("I");
                                vistaSwing.getjButton27().setText("O");
                                vistaSwing.getjButton28().setText("P");  
                                vistaSwing.getjLabel1().setIcon(Netbeans.png);
                                 vistaSwing.getjLabel2().setIcon(seduca.png);
                                vistaSwing.getjLabel3().setIcon(Logo.jpg);          
                                vistaSwing.getjLabel4().setIcon(codoacodo.png);          
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