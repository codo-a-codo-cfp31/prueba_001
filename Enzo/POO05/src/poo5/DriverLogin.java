package poo5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author @AnalistaSistok 
 */
public class DriverLogin{
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
            view.draw("Ingrese nombre de usuario");
            username = unScanner.next();
     view.draw("Ingrese contraseña");
            password = unScanner.next();
              if ( (username.compareTo(profile.getUsername()) == 0 ) && (password.compareTo(profile.getPassword())==0)) {
                view.draw("Ingreso correcto");
                registrationCompleted = Boolean.TRUE;
            } else {
                view.draw("Datos ingresados erroneos");
            }
        } while (registrationCompleted);
    } 
}