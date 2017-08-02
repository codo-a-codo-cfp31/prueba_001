/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import java.util.*;

/**
 *
 * @author CFP31-21
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //llamo al objeto instancia y lo imprimo 
        Singleton UnaInstancia = Singleton.GetSingleton();
                       
        System.out.println(UnaInstancia);
        
        // aunque creo otra variable instancia siempre sera el mismo objeto.
        Singleton otraInstancia = Singleton.GetSingleton();
                       
        System.out.println(otraInstancia);
        
    IView unaVista =new ViewJPanel();
   Controlador unControlador = new Controlador(unaVista);
    
   unControlador.Run();
    
    //aca termino
    
    UserProfile perfildelusuario = unControlador.getPerfil();
    
    ControladorLogin otroControlador = new ControladorLogin (unaVista, perfildelusuario);
    //necesita los dos parametros para poder crear el objeto ya que el contructor de constructorLogin los requiere.
    otroControlador.Run();
    }
    
}
