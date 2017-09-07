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
public class ConversorDistancia {
    
    protected float distance;
    protected String unit;

    public ConversorDistancia() {
        distance = 0.0f;
        unit = "";
    }
    
    public void setDistance(float newDistance, String newUnit){
        distance = newDistance;
        unit = newUnit;
    }
    
    
    public float getDistance(String toUnit){
        float distanceResult=0;
        if (unit.equalsIgnoreCase("km")) {
            if (toUnit.equalsIgnoreCase("mi")) {
                distanceResult = distance * 0.621f;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("C")) {
                distanceResult = distance / 0.621f;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        
        return distanceResult;
    }
         
}
