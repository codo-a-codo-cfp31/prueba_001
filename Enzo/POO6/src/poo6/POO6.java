/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class POO6 {
 /**
  * @param args the command line arguments
  */
    public static void main(String[] args) {
        // TODO code application logic here
       Controller unControlador = new Controller(new Vista());  
        unControlador.Run();   
    }
}