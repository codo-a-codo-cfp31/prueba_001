/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.util.Scanner;

/**
 *
 * @author CFP31-15
 */
public class Controlador {
    
    protected UserProfile perfil;        
    protected IView view;
    
    

    public Controlador(IView view) {
        this.view = view;
    }
    
    
    public UserProfile getPerfil() {
        return perfil;
    }

    public void setPerfil(UserProfile perfil) {
        this.perfil = perfil;
    }
    
    
    
    public void Run() {
        
        Scanner unScanner = new Scanner(System.in);
        String username = "";
        String email = "";
        String password = "";
        String confirmationPassword = "";
        Boolean registrationCompleted = Boolean.FALSE;
        perfil = new UserProfile();

        view.Draw("Perfil de usuario" + perfil.comoTeLlamas());

        do {
            view.Draw("Ingrese nombre de usuario");
            username = unScanner.next();

            view.Draw("Ingrese email");
            email = unScanner.next();

            if (!email.contains("@")) {
                view.Draw("ERROR, No es un email");
                continue;
            }

            view.Draw("Ingrese contraseña");
            password = unScanner.next();

            if (password.length() < 8) {
                view.Draw("ERROR, la contrassñea debe ser mayor a 8 caracteres");
                continue;
            }

            view.Draw("Ingrese confirmacion de contraseña");
            confirmationPassword = unScanner.next();

            // if (password.eualToIgnoreCase(confirmationPassword)
            if (password.compareTo(confirmationPassword) == 0) {
                registrationCompleted = Boolean.TRUE;
            }
        } while (!registrationCompleted);
    }
}
