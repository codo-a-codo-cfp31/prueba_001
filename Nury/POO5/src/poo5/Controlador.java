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
    public void Run(){
      IPersona Persona = new Persona();
        
        System.out.println("Bienvenido, ingrese un usuario");
        
        Scanner unScanner = new Scanner(System.in);
        
        String username = unScanner.next();
        
        System.out.println("ingrese una password de 8 caracteres");
        
        String password = unScanner.next();
        
        System.out.println("ingrese su contraseña nuevamente");
        
        String password2 = unScanner.next();
        
        if (password.equalsIgnoreCase(password2) && (password.length()==8) ){
        System.out.println("contraseña guardada con exito");
        }
        else{
        System.out.println(); 
        }
        
        System.out.println("ingrese un email");
        
        String email = unScanner.next();
        
        if (email.contains("@")){
            System.out.println("email guardado con exito");
        }
    }
        
}
