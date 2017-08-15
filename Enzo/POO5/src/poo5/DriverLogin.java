/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.util.*;
/**
 *
 * @author @AnalistaSistok #CFP31 #SEducA
 */
public class DriverLogin {

    protected IView view;
    protected UserProfile profile;

    public DriverLogin(IView view, UserProfile profile) {
        this.view = view;
        this.profile = profile;
    }

    public void Run() {
        Scanner unScanner = new Scanner(System.in);
        String username = "";
        String password = "";

        Boolean registrationCompleted = Boolean.FALSE;

        do {
            view.Draw("Ingrese nombre de usuario");
            username = unScanner.next();

            view.Draw("Ingrese contraseña");
            password = unScanner.next();
            
            if ( (username.compareTo(profile.getUsername()) == 0 ) && (password.compareTo(profile.getPassword())==0)) {
                view.Draw("Ingreso correcto");
                registrationCompleted = Boolean.TRUE;
            } else {
                view.Draw("Datos ingresados erroneos");
            }
         } while (registrationCompleted);
    }
}