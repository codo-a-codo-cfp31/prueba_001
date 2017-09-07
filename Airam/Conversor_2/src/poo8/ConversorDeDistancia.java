/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

/**
 *
 * @author CFP31-09
 */
public class ConversorDeDistancia {

    protected String unidad1;
    protected float longitud;

    public ConversorDeDistancia() {
        unidad1 = "";

    }

    public float getlongitud(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("M")) {
            if (unidad2.equalsIgnoreCase("Km")) {
                longitud = (float) ((longitud * 1.60) / 1.0);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("Km")) {
            if (unidad2.equalsIgnoreCase("M")) {
                longitud = (float) ((longitud * 0.62) / 1.0);
            }
        } else { //mensaje de error
        }

        return longitud;
    }

    public void setlongitud(float longitud, String unidad2) {
        this.longitud = longitud;
        this.unidad1 = unidad2;
    }

}
