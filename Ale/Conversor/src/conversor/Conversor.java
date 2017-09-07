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
        float temperatureResult=0;
        if (unit.equalsIgnoreCase("C")) {
            if (toUnit.equalsIgnoreCase("K")) {
                temperatureResult = temperature + 273.15f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("C")) {
                temperatureResult = temperature - 273.15f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return temperatureResult;
    }
         
}
