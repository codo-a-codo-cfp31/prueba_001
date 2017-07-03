/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import java.util.*;

/**
 *
 * @author cfp31-06
 */
public class Aula {
    
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    public Aula(){
        //La lista se comporta como una interface
        lista_de_muebles = new ArrayList();
        lista_de_personas = new ArrayList();
        
        lista_de_personas.add(new Profesor());
        
        for (int i = 0; i < 6; i++) {
            lista_de_personas.add(new Alumno());
        }
        
        for (int i = 0; i < 7; i++) {
            lista_de_muebles.add(new Silla());
        
    }
        for (int i = 0; i < 4; i++) {
            lista_de_muebles.add(new Mesa());
            
    }        
    }
        public List<IPersona> dameLaListaDePersonas(){
            return lista_de_personas;
    }
    
}