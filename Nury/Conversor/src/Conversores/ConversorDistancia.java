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
        distance = 0.0f;
        unit = "";
    }

    @Override
    public void setMedida(float newDistance, String newUnit) {
        distance = newDistance;
        unit = newUnit;
    }

    @Override
    public float getMedida(String toUnit) {
        float distanceResult = 0;
        if (unit.equalsIgnoreCase("km")) {
            if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult = distance * 0.621f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("km")) {
                distanceResult = distance / 0.621f;
            } else {
                //de K a K No hago nada de nada
            }

        }

        return distanceResult;
    }

    @Override
    public List<String> getUnitList() {
        List<String> UnitList = new ArrayList();

        UnitList.add("km");
        UnitList.add("mi");

        return UnitList;
    }

}
