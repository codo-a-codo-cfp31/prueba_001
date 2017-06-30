
package poo3;

import java.util.*;

public class Aula {
    
    protected List<IPersona> lista_de_personas;
    protected List<Mueble> lista_de_muebles;
    
    
    public Aula(){
      lista_de_muebles = new ArrayList();
      lista_de_personas = new ArrayList(); 
      
      lista_de_personas.add(new Profesor());
          
    for (int i = 0; i < 6; i++) {
        lista_de_personas.add(new Alumno());        
        }
    
    for (int i = 0; i < 5; i++) {
        lista_de_muebles.add(new Mesa());        
        } 
      
    for (int i = 0; i < 17; i++) {
        lista_de_muebles.add(new Silla());        
        } 

              
    }
}
