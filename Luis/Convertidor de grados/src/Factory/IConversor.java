/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import convertidor.de.grados.*;

/**
 *
 * @author Luis Vera
 */
public interface IConversor {
    
    public void setValor(float Valor, String unidad);

    public float getValor(String unidad);
    
   
    
}
