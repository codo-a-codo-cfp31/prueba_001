/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula;

/**
 *
 * @author CFP31-14
 */
public class Ropa {

    protected String talle;
    protected String color;
    protected String tipo;

    public Ropa() {
        talle = "unTalle";
        color = "rojo";
        tipo = "lalal";
    }

    public Ropa(String nuevotalle, String nuevocolor, String nuevotipo) {
        talle = nuevotalle;
        color = nuevocolor;
        tipo = nuevotipo;
    }

    public String descripcionRopa() {
        return "Ropa talle " + talle + "color: " + color + "Tio de ropa: " + tipo;
    }
}
