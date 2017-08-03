/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

/**
 *PATRON DE DISEÑO ESTRUCTURAL ""COMPOSITE""
 * 
 * el composite es un patron de diseño que contiene metodos para AGREGAR (Add), Eliminar(Remove) y obtener (GetArray)
 * esto nos permite hacer de nuestros objetos composite para que ellos puedan agregar eliminar y obtener.
 * De esta forma hacemos que nuestro diseño parezca una cadena donde existen composite dentro de composite. 
 * cada objeto puede agregado tambien podra agregar eliminar y obtener y asi sucesivamente.
 * 
 * @author CFP31-21
 */
public class POO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
