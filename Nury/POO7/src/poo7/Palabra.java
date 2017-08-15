/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;
import java.math.*;

/**
 *
 * @author CFP31-10
 */
public class Palabra {
     protected List<String> ListaDePalabras;
     protected Integer Long;
     protected char Letra;
     protected String PalabraElegida;
        
        
        
         public Palabra(){
            ListaDePalabras = new ArrayList<>();
            ListaDePalabras.add("PALA");
            ListaDePalabras.add("OTORRINOLARINGOLOGO");
            ListaDePalabras.add("VENEZUELA");
         //   ListaDePalabras.add("SUPERVISORA");
           // ListaDePalabras.add("ESPERMOGRAMA");
            ListaDePalabras.add("CORCHETE");
            ListaDePalabras.add("XENOFOBIA");
            ListaDePalabras.add("DESCOMPUESTO");
         }
        
        public String getPalabraElegida(){
            int max =ListaDePalabras.size();
           PalabraElegida = ListaDePalabras. get((int)(Math.random()*max));
                return PalabraElegida;
        }
        
        public Integer getLong(){
            Long = PalabraElegida.length();
            return Long;
        }
        
}

