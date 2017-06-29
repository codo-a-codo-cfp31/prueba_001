/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CFP31-15
 */
// una clase es un molde para poder crear un objeto 
//en este caso este es el molde del objeto ropa y definimos sus caracteristicas o propiedades, y comportamientos.
public class Ropa {
    protected String talle;
    protected String color;
    protected String tipo;
    
    public Ropa(String unTalle, String unColor, String unTipo){
    talle= unTalle;
     color=unColor;
     tipo=unTipo;
     //un contructor en ropa para las variables talle, color,tipo
    }
    public String cualEsTuRopa(){
        return talle +" "+ color+" "+ tipo;
    // cree un metodo para que me imprima los valores de las variables
    } 

}

