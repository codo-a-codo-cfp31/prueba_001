/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;


//Cuando se crea una interface con sus metodos, todos estos metodos deben cumplirse en la clase q se le aplica la interface (cuando se le pone implements)
/**
 *
 * @author cfp31-06
 */
public interface IPersona  {

    
    public String comoTeLlamas();
    public void ahoraTeLlamas(String tuNuevoNombre);
    
    
    public String cualEsTuApellido();
    public void ahoraTuApellidoEs(String tuNuevoApellido);

}
