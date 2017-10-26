/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author alejandro.medici
 */
public class Keyboard extends JInternalFrame implements ActionListener{
    
    
    private List<IKeyGameListener> listeners;
    
    //private JFrame frame = new JFrame("Main Keyboard");
    private JPanel parent = new JPanel(new GridLayout(0, 1));
    private JPanel[] panel;
    private JButton[][] button;
    private static final String[][] key = {
        {"Q", "W", "E", "R", "T", "Y", "U", "I","O", "P",}, {"A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ",}, {"Z", "X", "C", "V", "B","N","M"},
        {}};

    public Keyboard() {
        initComponents();
        
    }
    
    private void initComponents() {
        listeners = new ArrayList<>();
        panel = new JPanel[6];
        for (int row = 0; row < key.length; row++) {
            panel[row] = new JPanel();
            button = new JButton[20][20];
            for (int column = 0; column < key[row].length; column++) {
                button[row][column] = new JButton(key[row][column]);
                button[row][column].putClientProperty("column", column);
                button[row][column].putClientProperty("row", row);
                button[row][column].putClientProperty("key", key[row][column]);
                button[row][column].addActionListener(this);
                panel[row].add(button[row][column]);
            }
            parent.add(panel[row]);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(parent);
        
        pack();
        setVisible(true);
    }
       
    
    public void AddListener(IKeyGameListener listener) {
        listeners.add(listener);
    }
    
    public void RemoveListener(IKeyGameListener listener) {
        listeners.remove(listener);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        Event event = new Event(ae, 0, ae);
        for (IKeyGameListener listener : listeners) {
            listener.listen(event);
        }
        
    }
    
}
