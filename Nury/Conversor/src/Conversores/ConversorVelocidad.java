/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author CFP31-10
 */
public class ConversorVelocidad implements IConversor {

    protected float velocidad;
    protected String unit;

    public ConversorVelocidad() {
        velocidad = 0.0f;
        unit = "";
    }

    @Override
    public void setMedida(float newVelocidad, String newUnit) {
        velocidad = newVelocidad;
        unit = newUnit;
    }

    @Override
    public float getMedida(String toUnit) {
        float velocidadResult = 0;
        if (unit.equalsIgnoreCase("km/h")) {
            if (toUnit.equalsIgnoreCase("mi/h")) {
                velocidadResult = (velocidad * 0.621371f);

            } else if (toUnit.equalsIgnoreCase("m/s")) {
                velocidadResult = velocidad * 0.2777777778f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else if (unit.equalsIgnoreCase("mi/h")) {
            if (toUnit.equalsIgnoreCase("km/h")) {
                velocidadResult = velocidad / 0.621371f;
            } else if (toUnit.equalsIgnoreCase("m/s")) {
                velocidadResult = (velocidad * 0.621371f) * 0.2777777778f;
            } else {
                //de K a K No hago nada de nada
            }

        } else if (unit.equalsIgnoreCase("m/s")) {
            if (toUnit.equalsIgnoreCase("km/h")) {
                velocidadResult = velocidad / 0.2777777778f;
            } else if (toUnit.equalsIgnoreCase("mi/h")) {
                velocidadResult = (velocidad * 0.621371f) / 0.2777777778f;
            }
        }
        return velocidadResult;
    }

    @Override
    public List<String> getUnitList() {
        List<String> UnitList = new ArrayList();

        UnitList.add("km/h");
        UnitList.add("mi/h");
        UnitList.add("m/s");

        return UnitList;
    }
}
