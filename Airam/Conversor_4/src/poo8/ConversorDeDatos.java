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
public class ConversorDeDatos {

    protected String unidad1;
    protected float datos;

    public ConversorDeDatos() {
        unidad1 = "";

    }

    public float getdatos(String unidad2) {
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

    public void setdatos(float datos, String unidad2) {
        this.datos = datos;
        this.unidad1 = unidad2;
    }

}
