/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AIRAM
 */
public class Juego implements IPalabra{
    
    private List<String> Palabras;
    String Palabra;

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }
     
 
    public void Juego(){
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
        
        double NumAleatorio = (int)(Math.random()*10);
        System.out.println(NumAleatorio);
        Palabra= (Palabras.get((int) NumAleatorio));
       
    }
     
     
    @Override
    public void contarPalabra() {
       System.out.println("La Palabra para Adivinar tiene " +Palabra.length()+ " caracteres");
    }

    @Override
    public void mostrarPalabra() {
        System.out.println(Palabra);
        
    }

    

   
    
}
