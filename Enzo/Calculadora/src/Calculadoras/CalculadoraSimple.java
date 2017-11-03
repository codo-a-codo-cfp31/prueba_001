/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoras;

import java.util.*;
/**
 *
 * @author CFP31-15
 */
public class CalculadoraSimple implements ICalculadora {

    protected float a;
    protected float b;
    protected String op;
    protected float result;
    
    public CalculadoraSimple() {
        a = 0.0f;
        b = 0.0f;
        op = "";
        result = 0.0f;
    }

    @Override
    public float getA() {
        return a;
    }

    @Override
    public void setA(float a) {
        this.a = a;
    }

    @Override
    public float getB() {
        return b;
    }

    @Override
    public void setB(float b) {
        this.b = b;
    }

    @Override
    public String getOp() {
        return op;
    }

    @Override
    public void setOp(String op) { 
        this.op = op;
    }


    @Override
    public void BinaryOperation(float elemento1, String operador, float elemento2) {
        a = elemento1;
        b = elemento2;
        op = operador;

        if (op.equalsIgnoreCase("+")) {
            result = a + b;
        } else if (op.equalsIgnoreCase("-")) {
            result = a - b;
        } else if (op.equalsIgnoreCase("x")) {
            result = a * b;
        } else if (op.equalsIgnoreCase("/")) {
            result = a / b;
        } else if (op.equalsIgnoreCase("^")) {
           Double valor=Math.pow(a, b);
            result = valor.floatValue();
        } else if (op.equalsIgnoreCase("y√x")) {
        Double valor=Math.pow(a, 1/b);
            result = valor.floatValue();
        }
    }

    @Override
    public String getResultString() {
        String resultString= Double.toString(result);
        return resultString;
    }

    @Override
    public void UnaryOperation(float elemento1, String Operador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}