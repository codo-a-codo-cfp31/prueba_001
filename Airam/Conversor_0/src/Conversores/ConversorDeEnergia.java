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
public class ConversorDeEnergia implements IConversor {

    protected String unidad1;
    protected float energia;

    public ConversorDeEnergia() {
        unidad1 = "";

    }

    public float getValor(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("J")) {
            if (unidad2.equalsIgnoreCase("Kwh")) {
                energia = (float) ((energia * 0.0000002778) / 1.0);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("Kwh")) {
            if (unidad2.equalsIgnoreCase("J")) {
                energia = (float) ((energia * 3600000) / 1.0);
            }
        } else { //mensaje de error
        }

        return energia;
    }

    public void setValor(float energia, String unidad2) {
        this.energia = energia;
        this.unidad1 = unidad2;
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista=new ArrayList<>();
        lista.add("J");
        lista.add("Kwh");
        return lista;
         }

}
