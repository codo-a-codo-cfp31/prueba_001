/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

/**
 *
 * @author CFP31-21
 */
public class Controlador {
     protected Vistas unaVista;

    public Controlador(Vistas unaVista) {
        this.unaVista = unaVista;
    }

    public void Run() {

     
        Empleado Gerente = new Empleado(50000,1,6);
        Empleado SubGerente = new Empleado(25000,2,8);
        Empleado Esclavo = new Empleado(10000,3,12);
        Empleado elDelivery = new Empleado (7000,4,10);
        Empleado elQueLimpia = new Empleado (6000,5,12);
        
        System.out.println(Gerente);
        
        Gerente.Add(SubGerente);
                 
        SubGerente.Add(Esclavo);
        
        Esclavo.Add(elDelivery);
        
        elDelivery.Add(elQueLimpia);
        
        System.out.println(Gerente);
    }
}
