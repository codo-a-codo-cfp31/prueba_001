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
public class ConversorDistancia implements IConversor {
  protected float distance;
    protected String unit;

    public ConversorDistancia() {
        distance=0.0f;
        unit="";
    }

    @Override
    public void setMedida(float newDistance, String newUnit) {
        distance=newDistance;
        unit=newUnit;
    }

    @Override
    public float getMedida(String toUnit) {
        float distanceResult=distance;
         if (unit.equalsIgnoreCase("mi")) {
            if (toUnit.equalsIgnoreCase("km")) {
                distanceResult=distance*(1609344f/1000000f);
            } else {
                //de C a C no hago Nada de Nada
            }
          if (toUnit.equalsIgnoreCase("m")) {
                distanceResult=distance*1609.344f;
            } else {
                //de C a C no hago Nada de Nada
            }
           if (toUnit.equalsIgnoreCase("cm")) {
                distanceResult=distance*1609.344f*100f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult=distance/(1609.344f/1000f);
            } else {
                //de K a K No hago nada de nada
            }
 }
         
        if (unit.equalsIgnoreCase("km")) {
           if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult=distance*(1000/1609.344f);
            } else {
                //de C a C no hago Nada de Nada
            }
           if (toUnit.equalsIgnoreCase("m")) {
                distanceResult=distance*1000f;
            } else {
                //de C a C no hago Nada de Nada
            }
          if (toUnit.equalsIgnoreCase("cm")) {
                distanceResult=distance*100000f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("km")) {
                distanceResult=distance/(1000/1609.344f);
            } else {
                //de K a K No hago nada de nada
            }
 }
        
         if (unit.equalsIgnoreCase("m")) {
           if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult=distance*(1/1609.344f);
            } else {
                //de C a C no hago Nada de Nada
            }
           if (toUnit.equalsIgnoreCase("km")) {
                distanceResult=distance/1000f;
            } else {
                //de C a C no hago Nada de Nada
            }
          if (toUnit.equalsIgnoreCase("cm")) {
                distanceResult=distance*100f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("m")) {
                distanceResult=distance/(1/1609.344f);
            } else {
                //de K a K No hago nada de nada
            }
 }
         
         if (unit.equalsIgnoreCase("cm")) {
           if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult=distance*1/(1609.344f*100f);
            } else {
                //de C a C no hago Nada de Nada
            }
           if (toUnit.equalsIgnoreCase("km")) {
                distanceResult=distance/100000f;
            } else {
                //de C a C no hago Nada de Nada
            }
           if (toUnit.equalsIgnoreCase("m")) {
                distanceResult=distance/100f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("cm")) {
                distanceResult=distance/(1/(1609.344f*100f));
            } else {
                //de K a K No hago nada de nada
            }
 }
 return distanceResult;
    }

    @Override
    public List<String> getUnitList() {
       List<String> UnitList = new ArrayList();
         UnitList.add("mi");
         UnitList.add("km");
        UnitList.add("m");
        UnitList.add("cm"); 
return UnitList;
    }
}