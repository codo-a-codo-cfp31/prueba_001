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
public class ConversorDeDatosBinarios {

    protected String unidad1;
    protected int datosBinarios;
    protected String datosBinarios2;
    

    public ConversorDeDatosBinarios() {
        unidad1 = "";

    }

    public float getdatosBinarios(String unidad2) {
        //temperatura= (JFramePOO8.jTextField1.getText());
        if (unidad1.equalsIgnoreCase("D")) {
            if (unidad2.equalsIgnoreCase("Hd")) {
                
                datosBinarios2 = Integer.toHexString(datosBinarios);
            }
        } else { //mensaje de error
        }
        if (unidad1.equalsIgnoreCase("Hd")) {
            if (unidad2.equalsIgnoreCase("D")) {
                datosBinarios2 = Integer.toBinaryString(datosBinarios);
            }
        } else { //mensaje de error
        }

        return datosBinarios;
    }

    public void setdatosBinarios( datosBinarios, String unidad2) {
        this.datosBinarios = datosBinarios;
        this.unidad1 = unidad2;
    }

}
