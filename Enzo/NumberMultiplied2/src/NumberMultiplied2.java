/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
/**
 *
 * @author ELSA.BENAviD00953
 */
public class NumberMultiplied2 {
    public static void main(String[] args) {
   int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
  " numero para multiplicarlo por 2")); 
    
    int resultado=numero*2;
JOptionPane.showMessageDialog(null,"Numero ingresado fue:"+numero+"\nResultado es:"+resultado);
    }
}