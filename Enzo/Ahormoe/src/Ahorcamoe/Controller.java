package Ahorcamoe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Controller {
     protected Vista unaVista;

    public Controller(Vista unaVista) {
       this.unaVista = unaVista;
    }

    public void Run() {
 unaVista.getVistaSwing().setjTextPane1("");
        Math.random();
    }
}