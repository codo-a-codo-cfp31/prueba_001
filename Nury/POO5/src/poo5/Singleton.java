/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/** SINGLETON
 * esto es un singleton que me permite crear la instancia de un objeto una sola vez para crearlo tengo que seguir
 * los siguentes pasos:
 * 
 * 1)constructor private
 * 2)metodo static para construir una instancia
 * 3)propiedad o variable static para guardar la instancia creada
 * 
 Al utilizar este Patron de diseño garantizo que un objeto solo se pueda crear o instanciar una sola vez ya que el mismo
 vive en el stack, no en el heap.
 * este objeto no puede ser heredable ni modificarse o crearse mas de una vez 
 */


// cree mi clase Singleton
public class Singleton {
    
// cree mi propiedad static para la variable instance y la inicialice
    private static Singleton instance = null;
    
// cree un constructor private
    private Singleton() {
    }
// cree mi metodo static donde creo esta instancia es decir mi objeto y este metodo ya me devuelve el objeto creado..
//...si no se creo antes. 
    
    public static Singleton GetSingleton() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }
}
