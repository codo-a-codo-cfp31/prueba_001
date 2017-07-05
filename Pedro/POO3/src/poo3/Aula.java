/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;
import java.util.*;

/**
 *
 * @author CFP31-08
 */
public class Aula {
    // aca creo una lista de personas y una de muebles
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    //este es mi constructor.
    public Aula(){
        lista_de_muebles = new ArrayList();
        lista_de_personas = new ArrayList();
        
        IPersona unProfesor = new Profesor();
        lista_de_personas.add(unProfesor);
        unProfesor.ahoraTeLlamas("Alejandro");
        
       // para indice cero hasta indice menor a 6 crear un objeto alumno
       // for (int i = 0; i < 6; i++){
       //   lista_de_personas.add(new Alumno());
       //se puede usar el para o se puede copiar esta expresion 6 veces para crear 6 alumnos.
       //}  
        for (int i= 0; i <5; i++){   
             lista_de_muebles.add(new Mesa());
        }
        for (int i=0; i<16; i++) {
            lista_de_muebles.add(new Silla());
        }
    }
    //aca hago un metodo para agregar alumnos a la lista de personas
    public void addAlumno(Alumno AlumnoAgregado){
        lista_de_personas.add(AlumnoAgregado);
    } 
    
    public List<IPersona> dameLaListaDePersonas(){
        return lista_de_personas;
    }
    
    
    
}
