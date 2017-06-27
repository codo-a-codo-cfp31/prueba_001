/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CFP31-08
 */
public class Carpintero extends Persona {
//extends es la forma de definir que Carpintero tambien es una persona.
     public Carpintero(){
         super("L", "Rojo", "franela");
    //con la palabra super invocamos al constructor que pasa 3 parametros
    //defino de una vez los valores para ropa.
     }
}
