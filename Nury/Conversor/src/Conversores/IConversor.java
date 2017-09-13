/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import conversor.*;
import java.util.List;

/**
 *
 * @author CFP31-10
 */
public interface IConversor {
    
    
    public void setMedida(float newMedida,String Unit);
    public float getMedida(String toUnit);
    public List<String>getUnitList();
}
