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
 * @author Luis Vera
 */
public class ConversorDeVelocidad implements IConversor {

    protected float velocidad;
    protected String unidad1;

    public ConversorDeVelocidad() {

        unidad1 = "";
    }

    @Override
    public void setValor(float velocidad, String unidad2) {
        this.velocidad = velocidad;
        this.unidad1 = unidad2;
    }

    @Override
    public float getValor(String unidad2) {
        if (unidad1.equalsIgnoreCase("Km/h")) {
            if (unidad2.equalsIgnoreCase("M/h")) {
                velocidad = (float) (velocidad * 0.621371);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("F")) {
            if (unidad2.equalsIgnoreCase("C")) {

                velocidad = (float) (velocidad * 0.2777777778);
            }
        } else { //mensaje de error
        }

        return velocidad;
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista = new ArrayList<>();
        lista.add("Km/h");
        lista.add("M/h");
        return lista;
    }
}
