/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author CFP31-15
 */
public class Conversor {
    
    protected float temperature;
    protected String unit;

    public Conversor() {
        temperature = 0.0f;
        unit = "";
    }
    
    public void setTemperature(float newTemperature, String newUnit){
        temperature = newTemperature;
        unit = newUnit;
    }
    
    
    public float getTemperature(String toUnit){
        
        if (unit.equalsIgnoreCase("C")) {
            if (toUnit.equalsIgnoreCase("K")) {
                temperature = temperature + 273.15f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("C")) {
                temperature = temperature - 273.15f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return temperature;
    }
         
}
