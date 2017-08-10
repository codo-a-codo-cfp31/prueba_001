/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.util.Scanner;

/**
 *
 * @author cfp31-06
 */
public class ControladorLogin {
    
    protected IView view;
    protected UserProfile perfil;

    public ControladorLogin(IView view, UserProfile perfil) {
        this.view = view;
        this.perfil = perfil;
        
        
    }
    
    public void Run(){
        Scanner unScanner = new Scanner(System.in);
        String username = "";
        String password = "";
        
        Boolean registrationCompleted = Boolean.FALSE;
        
    }
}
