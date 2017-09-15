/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import java.util.ArrayList;
import java.util.List;
import poo8.*;

/**
 *
 * @author CFP31-09
 */
public class ConversorDeDatos implements IConversor{

    protected String unidad1;
    protected float datos;

    public ConversorDeDatos() {
        unidad1 = "";

    }

    public float getValor(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("B")) {
            if (unidad2.equalsIgnoreCase("Kb")) {
                datos = (float) ((datos * 0.000125) / 1.0);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("Kb")) {
            if (unidad2.equalsIgnoreCase("B")) {
                datos = (float) ((datos * 8000) / 1.0);
            }
        } else { //mensaje de error
        }

        return datos;
    }

    public void setValor(float datos, String unidad2) {
        this.datos = datos;
        this.unidad1 = unidad2;
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista=new ArrayList<>();
        lista.add("B");
        lista.add("Kb");
        return lista;
        
    }

}
