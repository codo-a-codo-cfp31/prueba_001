/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;

/**
 *
 * @author @author @AnalistaSistok #SEducA #CFP31
 */
public class PalabraAdivina{
     int intentos;
    String palabraIngresada="";
    private List<String> palabras;
    Juego compara=new Juego();
    
    public void PalabraAdivina(){
        palabras = new ArrayList<>(); 
        Scanner unScanner = new Scanner(System.in);
        System.out.println("Inserta una palabra");
        palabraIngresada = unScanner.next();
         palabras.add(palabraIngresada);
       System.out.println(palabras);
    }
    }