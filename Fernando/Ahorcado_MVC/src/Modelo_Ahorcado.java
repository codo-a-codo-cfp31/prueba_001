
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado_mvc;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ffhernan
 */
public class Modelo_Ahorcado {
    
    String Palabra;
    private List<String> listaPalabras;
  
    private void Modelo_Ahorcado(){
       listaPalabras = new ArrayList<>(); 
       
       listaPalabras.add("ENALAPRIL");
       listaPalabras.add("ORNITORRINCO");
       listaPalabras.add("ESDRUJULA");
       listaPalabras.add("DINOSAURIO");
       listaPalabras.add("CASA" );
    }
    
    public String getPalabra() {
        return Palabra;
    }
    
    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }
      
     public void Aleatorio(){
        int NumAleatorio = (int)(Math.random()*10);
        Palabra=(listaPalabras.get((int) NumAleatorio));
    }
    
    public int contarPalabra() {
       return Palabra.length();
    }

    public void mostrarPalabra() {
        System.out.println(Palabra);      
    }   
}
