/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;
import java.util.*;
import java.util.List;
/**
 *
 * @author Luis Vera
 */
public class Juego {
    
    protected Palabra laPalabraAleatoria;
    
        
public Juego(){
    


}

public final void ObtenerPalabra(){
    
    laPalabraAleatoria = new Palabra();
    laPalabraAleatoria.PalabraRandom(); //Este inicializa la variable "laPalabraAleatoria" porque dentro de este metodo se le dio valor a esta variable
    System.out.println(laPalabraAleatoria.getPalabraAleatoria());
    
    
    
}

}


    

