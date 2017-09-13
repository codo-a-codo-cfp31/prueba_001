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
public class ConversorDataSize implements IConversor {

    protected float dataSize;
    protected String unit;

    public ConversorDataSize() {
        dataSize = 0.0f;
        unit = "";
    }

    @Override
    public void setMedida(float newDataSize, String newUnit) {
        dataSize = newDataSize;
        unit = newUnit;
    }

    @Override
    public float getMedida(String toUnit) {
        float dataSizeResult = 0.0f;
        if (unit.equalsIgnoreCase("b")) {
            if (toUnit.equalsIgnoreCase("KB")) {
                dataSizeResult = dataSize * 0.0001220703125f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("b")) {
                dataSizeResult = dataSize / 0.0001220703125f;
            } else {
                //de K a K No hago nada de nada
            }

        }
        return dataSizeResult;
    }

    @Override
    public List<String> getUnitList() {
        List<String> UnitList = new ArrayList();

        UnitList.add("b");
        UnitList.add("KB");

        return UnitList;
    }

}
