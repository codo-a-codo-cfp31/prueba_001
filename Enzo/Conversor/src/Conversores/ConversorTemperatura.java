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
        temperature=0.0f;
        unit="";
    }
    
    @Override
    public void setMedida(float newTemperature, String newUnit){
        temperature=newTemperature;
        unit=newUnit;
    }
    
    @Override
    public float getMedida(String toUnit){
        float temperatureResult=temperature;
        if (unit.equalsIgnoreCase("C")) {
            if (toUnit.equalsIgnoreCase("K")) {
                temperatureResult=temperature+273.15f;
            } else {
                //de C a C no hago Nada de Nada
            }
             if (toUnit.equalsIgnoreCase("F")) {
                temperatureResult=(temperature*9/5)+32f;
            } else {
                //de C a C no hago Nada de Nada
            }
        }
        
        if (unit.equalsIgnoreCase("K")) {
            if (toUnit.equalsIgnoreCase("C")) {
                temperatureResult=temperature-273.15f;
            } else {
                //de C a C no hago Nada de Nada
            }
            if (toUnit.equalsIgnoreCase("F")) {
                temperatureResult=(temperature*9/5)-459.67f;
            } else {
                //de C a C no hago Nada de Nada
            }
        }
        
        if (unit.equalsIgnoreCase("F")) {
            if (toUnit.equalsIgnoreCase("C")) {
                temperatureResult=(temperature-32f)*5/9;
            } else {
                //de C a C no hago Nada de Nada
            }
            if (toUnit.equalsIgnoreCase("K")) {
                temperatureResult=(temperature-32f)*5/9+273f;
            } else {
                //de C a C no hago Nada de Nada
            }
        }
        return temperatureResult;
    }

    @Override
    public List<String> getUnitList(){
        List<String> UnitList= new ArrayList();
        UnitList.add("C");
        UnitList.add("K");
        UnitList.add("F");
        return UnitList; 
    }    
}