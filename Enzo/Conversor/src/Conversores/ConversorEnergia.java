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
public class ConversorEnergia implements IConversor {
   protected float energy;
    protected String unit;

    public ConversorEnergia() {
        energy=0.0f;
        unit="";
    }
    
    @Override
    public void setMedida(float newEnergy, String newUnit){
        energy=newEnergy;
        unit=newUnit;
    }
    
     @Override
    public float getMedida(String toUnit){
        float energyResult=0;
        if (unit.equalsIgnoreCase("J")) {
            if (toUnit.equalsIgnoreCase("kWh")) {
                energyResult=energy*0.0000002778f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("J")) {
                energyResult=energy/0.0000002778f;
            } else {
                //de K a K No hago nada de nada
            }
        }
        return energyResult;
    }

    @Override
    public List<String> getUnitList() {
         List<String> UnitList= new ArrayList();
       UnitList.add("J");
        UnitList.add("kWh");
       return UnitList;
    }    
}