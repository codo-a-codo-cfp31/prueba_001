/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author CFP31-21
 */
public class ControladorLogin {
       protected UserProfile perfil;


    public UserProfile getPerfil() {
        return perfil;
    }
    
    protected IView view;

    public ControladorLogin(IView view,UserProfile perfildelusuario) {
        this.view = view;
        this.perfil = perfildelusuario;
    }
    public ControladorLogin(){}
    
    public void Run(){}
}

