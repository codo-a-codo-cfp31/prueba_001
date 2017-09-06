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
public class ConversorEnergia {
    
    protected float energy;
    protected String unit;

    public ConversorEnergia() {
        energy = 0.0f;
        unit = "";
    }
    
    public void setWeigth(float newEnergy, String newUnit){
        energy = newEnergy;
        unit = newUnit;
    }
    
    
    public float getEnergy(String toUnit){
        float energyResult=0;
        if (unit.equalsIgnoreCase("J")) {
            if (toUnit.equalsIgnoreCase("kWh")) {
                energyResult = energy * 0.0000002778f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("J")) {
                energyResult = energy / 0.0000002778f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return energyResult;
    }
         
}
