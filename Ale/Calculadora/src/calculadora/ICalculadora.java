/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.List;

/**
 *
 * @author CFP31-15
 */
public interface ICalculadora {

    public void binaryOperation(float elemento1, String operacion, float elemento2);
    public float getResult();
}
