/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula;
import java.util.*;
public class Aula {
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    public Aula(){
        lista_de_personas=new ArrayList();
        lista_de_muebles=new ArrayList();
        
        lista_de_personas.add(new Profesor());
        
        for(int i=0;i<6;i++){
            lista_de_muebles.add(new Sillas());
        }
        
        for(int i=0;i<3;i++){
            lista_de_muebles.add(new Mesas());
        }
     }

    public void addAlumno(Alumno unAlumno){
            lista_de_personas.add(unAlumno);
        }
    public List<IPersona> dameLaListaDePersonas(){
        retun lista_de_personas;
    }
}
