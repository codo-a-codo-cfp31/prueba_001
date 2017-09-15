/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import java.util.List;
import poo8.*;

/**
 *
 * @author CFP31-09
 */
public interface IConversor {
    public void setValor(float valor, String unit);
    public float getValor(String unit);
    
    public List<String> getUnitList();
    //**aqui se deberia pedir a los conversores la lista de unidades que tiene los conversores
    
}
