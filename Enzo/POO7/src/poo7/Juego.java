/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Juego{
    
    private List<String> Palabras;
    String Palabra;

   public Juego(){
        listaPalabras();
    }
     
    final public void listaPalabras(){
       Palabras = new ArrayList<>(); 
       
       Palabras.add("Glaucoma");
       Palabras.add("Arquitecto");
       Palabras.add("Media");
       Palabras.add("Sauna");
       Palabras.add("Olla");
       Palabras.add("Piso");
       Palabras.add("Cama");
       Palabras.add("Gorra");
       Palabras.add("Gato");
       Palabras.add("Cono");
       Palabras.add("Gas");
       
       System.out.println(Palabras);
    }
      
     public void Aleatorio(){
        int NumAleatorio = (int)(Math.random()*10);
        Palabra= (Palabras.get((int)NumAleatorio));
         System.out.println(NumAleatorio);
        System.out.println(Palabra);
      }
}