/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import conversor.*;
import java.util.*;

/**
 *
 * @author CFP31-15
 */
public class ConversorPeso implements IConversor {
    
    protected float weigth;
    protected String unit;

    public ConversorPeso() {
        weigth = 0.0f;
        unit = "";
    }
    
    @Override
    public void setMedida(float newPeso, String newUnit){
        weigth = newPeso;
        unit = newUnit;
    }
    
    
    @Override
    public float getMedida(String toUnit){
        float weigthResult=0;
        if (unit.equalsIgnoreCase("kg")) {
            if (toUnit.equalsIgnoreCase("lb")) {
                weigthResult = weigth * 2.205f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("kg")) {
                weigthResult = weigth / 2.205f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return weigthResult;
    }

    @Override
    public List<String> getUnitList() {
        List<String> UnitList = new ArrayList();
        
        UnitList.add("Kg");
        UnitList.add("Lb");
        
        return UnitList;
        
    }
         
}
