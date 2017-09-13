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
public class ConversorDeTemperatura implements IConversor {

    protected String unidad1;
    protected float temperatura;

    public ConversorDeTemperatura() {
        unidad1 = "";

    }

    public float getValor(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("C")) {
            if (unidad2.equalsIgnoreCase("F")) {
                temperatura = (float) ((temperatura - 32) / 1.8000);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("F")) {
            if (unidad2.equalsIgnoreCase("C")) {
                temperatura = (float) ((temperatura * 1.8000) + 32.00);
            }
        } else { //mensaje de error
        }

        return temperatura;
    }

    public void setValor(float temperatura, String unidad2) {
        this.temperatura = temperatura;
        this.unidad1 = unidad2;
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista=new ArrayList<>();
        lista.add("C");
        lista.add("F");
        return lista;
          }

   

}
