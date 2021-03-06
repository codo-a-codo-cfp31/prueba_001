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
public class ConversorTemperatura implements IConversor{
    
    protected float temperature;
    protected String unit;

    public ConversorTemperatura() {
        temperature = 0.0f;
        unit = "";
    }
    
    @Override
    public void setMedida(float newTemperature, String newUnit){
        temperature = newTemperature;
        unit = newUnit;
    }
    
    
    @Override
    public float getMedida(String toUnit){
        float temperatureResult=0;
        if (unit.equalsIgnoreCase("C")) {
            if (toUnit.equalsIgnoreCase("K")) {
                temperatureResult = temperature + 273.15f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("C")) {
                temperatureResult = temperature - 273.15f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return temperatureResult;
    }

    @Override
    public List<String> getUnitList(){
        List<String> UnitList= new ArrayList();
        
        UnitList.add("C");
        UnitList.add("K");
        
        
        return UnitList;
        
    }

         
}
