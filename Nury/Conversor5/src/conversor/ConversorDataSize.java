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
public class ConversorDataSize {
    
    protected float dataSize;
    protected String unit;

    public ConversorDataSize() {
        dataSize= 0.0f;
        unit = "";
    }
    
    public void setDataSize(float newDataSize, String newUnit){
        dataSize = newDataSize;
        unit = newUnit;
    }
    
    
    public Double getDataSize(String toUnit){
        Double dataSizeResult=0.0;
        if (unit.equalsIgnoreCase("b")) {
            if (toUnit.equalsIgnoreCase("KB")) {
                dataSizeResult = dataSize * 0.0001220703125;
            } else {
                //de C a C no hago Nada de Nada
            }
        } else {
            if (toUnit.equalsIgnoreCase("b")) {
                dataSizeResult = dataSize / 0.0001220703125;
            } else {
                //de K a K No hago nada de nada
            }
            
        }
        return dataSizeResult;
    }
         
}
