/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author ELSA.BENAviD00953
 */
import java.util.*;
import java.io.*;
public class Aula {
    
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    public Aula(){    
    Alumno unAlumno = new Alumno(); 
    Profesor unProfesor = new Profesor();
    
    lista_de_personas = new ArrayList();
    lista_de_muebles = new ArrayList();
    
        lista_de_personas.add(new Profesor());
        for (int i = 0; i < 6; i++) {
            lista_de_muebles.add(new Silla());
        }

        for (int i = 0; i < 3; i++) {
            lista_de_muebles.add(new Mesa());
        }
    }

    public void addAlumno(Alumno unAlumno) {
        lista_de_personas.add(unAlumno);
    }

    public List<IPersona> dameLaListaDePersonas() {
        return lista_de_personas;
    }
}