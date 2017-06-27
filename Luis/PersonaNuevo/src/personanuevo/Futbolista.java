/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personanuevo;

/**
 *
 * @author Luis Vera
 */
public class Futbolista extends Persona  {
    
    public Futbolista (String unNombre, String unApellido, int unaEdad){
        super (unNombre, unApellido, unaEdad);
    }

    public Futbolista (String unTalle, String unColor, String unTipo){
        super (unTalle, unColor, unTipo);
        suRopa = new Ropa ("L", "Amarilla", "Camiseta");
    }
    
    public Ropa cualEsTuRopa(){
        return suRopa;
    }
        
}
