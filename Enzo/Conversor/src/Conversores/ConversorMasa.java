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
public class ConversorMasa implements IConversor {
    protected float mass;
    protected String unit;

    public ConversorMasa() {
        mass=0.0f;
        unit="";
    }
    
    @Override
    public void setMedida(float newMasa, String newUnit){
        mass=newMasa;
        unit=newUnit;
    }
    
    @Override
    public float getMedida(String toUnit){
        float resultMass=mass;
        if (unit.equalsIgnoreCase("kg")) {
            if (toUnit.equalsIgnoreCase("lb")) {
                resultMass=mass*2.205f;
            } else {
                //de C a C no hago Nada de Nada
            }
             if (toUnit.equalsIgnoreCase("g")) {
                resultMass=mass*1000f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("kg")) {
                resultMass=mass/2.205f;
            } else {
                //de K a K No hago nada de nada
            }
        }
        
        if (unit.equalsIgnoreCase("lb")) {
            if (toUnit.equalsIgnoreCase("kg")) {
                resultMass=mass/2.205f;
            } else {
                //de C a C no hago Nada de Nada
            }
             if (toUnit.equalsIgnoreCase("g")) {
                resultMass=mass*1000f/2.21f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("kg")) {
                resultMass=mass*2.205f;
            } else {
                //de K a K No hago nada de nada
            }
        }
        
        if (unit.equalsIgnoreCase("g")) {
            if (toUnit.equalsIgnoreCase("kg")) {
                resultMass=mass/1000f;
            } else {
                //de C a C no hago Nada de Nada
            }
             if (toUnit.equalsIgnoreCase("lb")) {
               resultMass=mass/1000f/2.21f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("g")) {
               resultMass=mass*1000f;
            } else {
                //de K a K No hago nada de nada
            }
        }
       return resultMass;
    }

    @Override
    public List<String> getUnitList() {
        List<String> UnitList = new ArrayList();
        UnitList.add("Kg");
        UnitList.add("g");
        UnitList.add("Lb");
       return UnitList;    
    }         
}