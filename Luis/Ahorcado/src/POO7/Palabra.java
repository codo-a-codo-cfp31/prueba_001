/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;

import java.util.*;
import java.util.List;

/**
 *
 * @author Luis Vera
 */
public class Palabra {
    
    private String PalabraAleatoria;
    private List<String> lista_de_palabras;
    private double NumAleatorio;
    
    public void Palabra(){
        
        lista_de_palabras = new ArrayList<>();
        lista_de_palabras.add(0,"Composicion");
        lista_de_palabras.add(1,"Alergico");
        lista_de_palabras.add(2,"Ministro");
        lista_de_palabras.add(3,"Combinacion");
        lista_de_palabras.add(4,"Estacionamiento");
        lista_de_palabras.add(5,"Software");
        lista_de_palabras.add(6,"Adhesion");
        lista_de_palabras.add(7,"Estrategia");
        lista_de_palabras.add(8,"Guachafa");
        lista_de_palabras.add(9,"Cancionero");
        
        System.out.println(lista_de_palabras);
        
    }
    
    public void Aleatorio(){
        
        NumAleatorio = (Math.random()*10);
        System.out.println(NumAleatorio);
        
    }
    
    

    
    
    
    
    
}
