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

        IView unaVista = new ViewConsole();
        Controlador unControlador = new Controlador(unaVista);
                
        unControlador.Run();
        //Aqui termina
        
        UserProfile userProfile = unControlador.getPerfil();
        
    }

}
