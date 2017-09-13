/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPackage;

/**
 *
 * @author CFP31-15
 */
public class ConversorTemperatura implements IConversor{
    
    protected float temperature;
    protected String unit;

    public ConversorTemperatura() {
        temperature = 0.0f;
        unit = "";
    }
    
    @Override
    public void setValor(float newTemperature, String newUnit){
        temperature = newTemperature;
        unit = newUnit;
    }
    
    
    @Override
    public float getValor(String toUnit){
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
