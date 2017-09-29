/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CFP31-15
 */
public class CalculadoraSimple implements ICalculadora {
    protected float resultado;
    public CalculadoraSimple() {
       resultado = 0.0f;
    }

    @Override
    public void binaryOperation(float elemento1, String operacion, float elemento2) {
        resultado = 0.0f;
        
        if (operacion.equals("+")) {
            resultado = elemento1 + elemento2;
        } else if (operacion.equals("-")) {
            resultado = elemento1 -  elemento2;
        }
    }

    @Override
    public float getResult() {
        return resultado;
   }

    
}
