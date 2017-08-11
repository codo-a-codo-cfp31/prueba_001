/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
/**
 *
 * @author @AnalistaSistok
 */
public class POO6 {
 /**
  * @param args the command line arguments
  */
    public static void main(String[] args) {
        // TODO code application logic here
       Controlador unControlador = new Controlador(new Vista());  
        unControlador.Run();   
    }
}