/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import java.util.*;

/**
 *
 * @author CFP31-15
 */
public class Aula {
    
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    
    public Aula(){
        
        lista_de_personas = new ArrayList();
        lista_de_muebles = new ArrayList();
        
        lista_de_personas.add(new Profesor());
        
        lista_de_personas.add(new Alumno());
        lista_de_personas.add(new Alumno());
        lista_de_personas.add(new Alumno());
        lista_de_personas.add(new Alumno());
        lista_de_personas.add(new Alumno());
        lista_de_personas.add(new Alumno());
    }
}
