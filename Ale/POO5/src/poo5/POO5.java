/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author CFP31-15
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singleton unaInstancia  = Singleton.getInstance();
        
        System.out.println(unaInstancia);
        
        Singleton otraInstancia  = Singleton.getInstance();
        
        System.out.println(otraInstancia);
        
        // TODO code application logic here
        IView unaVista = new ViewConsole();//new ViewJPanel();
        Controlador unControlador = new Controlador(unaVista);
                
        unControlador.Run();
        
        /// Aca termino
        UserProfile userProfile = unControlador.getPerfil();
        
        ControladorLogin otroControlador = new ControladorLogin(unaVista, userProfile);
        
        otroControlador.Run();
    }

}
