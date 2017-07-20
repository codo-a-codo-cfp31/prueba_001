package poo5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
 * @AnalistaSistok args the command line arguments
 */
public class POO5 {
    public static void main(String[] args) {
    // TODO code application logic here
    IView unaVista = new ViewJPanel();
        Controlador unControlador = new Controlador(unaVista);    
        unControlador.run();
       
        UserProfile userProfile = unControlador.getPefil();
        
        ControladorLogin otroControlador = new ControladorLogin(unaVista, userProfile);
        otroControlador.Run();
    }
}