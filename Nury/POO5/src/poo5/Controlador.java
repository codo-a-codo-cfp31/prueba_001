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
public class Controlador {
    
    protected UserProfile perfil;

    public UserProfile getPerfil() {
        return perfil;
    }
    
    protected IView view;

    public Controlador(IView view) {
        this.view = view;
    }
    
   
    
    public void Run(){
      IPersona UserProfile  = new Persona();
        
        view.Draw("Bienvenido, ingrese un usuario");
        
        Scanner unScanner = new Scanner(System.in);
        
        String username = unScanner.next();
        
        view.Draw("ingrese una password de 8 caracteres");
        
        String password = unScanner.next();
        
        view.Draw("ingrese su contraseña nuevamente");
        
        String password2 = unScanner.next();
        
        if (password.equalsIgnoreCase(password2) && (password.length()==8) ){
        view.Draw("contraseña guardada con exito");
        }
        
        view.Draw("ingrese un email");
        
        String email = unScanner.next();
        
        if (email.contains("@")){
           view.Draw("email guardado con exito");
        }
    }
        
}
