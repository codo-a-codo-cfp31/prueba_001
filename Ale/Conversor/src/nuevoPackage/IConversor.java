/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPackage;

import java.util.List;

/**
 *
 * @author CFP31-15
 */
public interface IConversor {
    //O public void setMagnitud(float valor, String unit)
    public void setValor(float valor, String unit);
    
    //O public float getMagnitud(Sring unit);
    public float getValor(String unit);
    
    public List<String> getUnitList();

  
}
