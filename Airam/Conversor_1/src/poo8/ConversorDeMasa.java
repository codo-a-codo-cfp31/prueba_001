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
public class ConversorDeMasa {

    protected String unidad1;
    protected float masa;

    public ConversorDeMasa() {
        unidad1 = "";

    }

    public float getmasa(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("Kg")) {
            if (unidad2.equalsIgnoreCase("L")) {
                masa = (float) ((masa * 2.20) / 1.0);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("L")) {
            if (unidad2.equalsIgnoreCase("Kg")) {
                masa = (float) ((masa * 0.45) / 1.0);
            }
        } else { //mensaje de error
        }

        return masa;
    }

    public void setmasa(float masa, String unidad2) {
        this.masa = masa;
        this.unidad1 = unidad2;
    }

}
