/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CFP31-09
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numlist;
       String nombre;
       String apellido;
       String buscarnombre;
     List<Persona> lista_de_personas;
      lista_de_personas = new ArrayList();
      
      
       numlist=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de la lista"));
       
       for (int i= 0; i <numlist; i++){ 
           
           nombre=JOptionPane.showInputDialog(null,"Ingrese Nombre "+i);
           apellido=JOptionPane.showInputDialog(null,"Ingrese Apellido "+i);
           Persona unapersona=new Persona(nombre,apellido);
           lista_de_personas.add(unapersona);
        }
      
       //JOptionPane.showMessageDialog(null, lista_de_personas);
       
       buscarnombre=JOptionPane.showInputDialog(null,"Ingrese Nombre a buscar: ");
       
       for (int i= 0; i <numlist; i++){ 
           
           Persona otrapersona= lista_de_personas.get(i);
           String nombre_de_la_persona=otrapersona.getNombre();
           if(buscarnombre.equalsIgnoreCase(nombre_de_la_persona)){
              JOptionPane.showMessageDialog(null, "Se encontro a la persona en "+i);
           }
        }
    }
    
}
