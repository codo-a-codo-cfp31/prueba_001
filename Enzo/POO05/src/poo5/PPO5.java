/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.io.IOException;

/**
 *
 * @author @AnalistaSistok
 */
public class PPO5 {
     public static void main(String[] args) throws IOException {
    Singleton unaInstancia  = Singleton.getInstance();
        
        System.out.println(unaInstancia);
        
        Singleton otraInstancia  = Singleton.getInstance();
        
        System.out.println(otraInstancia);
        
        // TODO code application logic here
        IView unaVista = new ViewConsole();//new ViewJPanel();
        Controller unControlador = new Controller(unaVista);
       unControlador.Run();
        /// Aca termino
       /* UserProfile userProfile = unControlador.getPefil();
         DriverLogin otroControlador = new DriverLogin(unaVista, userProfile);
        otroControlador.Run();*/
    }
}