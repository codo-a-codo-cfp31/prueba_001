/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;
import java.util.List;


public class Palabra {
    
     private List<String> Palabras;
     String PalabraAdivina;
     public static String EscondePalabraAdivina="";
     
     public Palabra()
     {
         ListaDePalabras();
     }
     
     final public void ListaDePalabras()
     {
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
     
     }
    
      public void PalabraAleatoria(){
        
        double NumAleatorio = (int)(Math.random()*10);
       // System.out.println(NumAleatorio);
        PalabraAdivina= (Palabras.get((int) NumAleatorio));
        
        // System.out.println(PalabraAdivina);
        
         String[] LetrasDePalabraAdivina = PalabraAdivina.split("");
         
          for (int i = 0; i < LetrasDePalabraAdivina.length; i++) {
            EscondePalabraAdivina = EscondePalabraAdivina +" _ ";
            //System.out.println(LetrasDePalabraAdivina[i]);
          //   System.out.println(EscondePalabraAdivina);
             
          }
        }
         public String Enviar(){
             return EscondePalabraAdivina;
             
          
          }   
       
    }

    

