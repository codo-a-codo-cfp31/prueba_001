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
    protected float elemento1;
    protected float elemento2;
    protected String operador;
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
        }else if (operacion.equals("X")) {
            resultado = elemento1 * elemento2;
    }else if (operacion.equals("/")) {
            resultado = elemento1 /  elemento2;
    }
    }

    @Override
    public float getResult() {
        return resultado;
   }

    @Override
    public void setElement1(float elemento1) {
        this.elemento1 = elemento1;
    }

    @Override
    public void setOperator(String operator) {
        this.operador = operator;
    }

    @Override
    public void setElement2(float elemento2) {
        this.elemento2 = elemento2;
    }

    @Override
    public float getElement1() {
    return elemento1;}

    @Override
    public String getoperator() {
       return operador;  }
 
}