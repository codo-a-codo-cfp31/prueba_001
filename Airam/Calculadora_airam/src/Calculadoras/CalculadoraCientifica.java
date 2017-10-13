/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoras;

/**
 *
 * @author cfp31-06
 */
public class CalculadoraCientifica extends CalculadoraSimple {

    protected float a;
    protected float b;
    protected String op;
    protected float result;

    public CalculadoraCientifica() {
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
    public void UnaryOperation(float elemento1, String operador) {
        a = elemento1;
        op = operador;

        if (op.equalsIgnoreCase("tan")) {
             result = (float) Math.tan(a);
        }
        if (op.equalsIgnoreCase("cos")) {
             result = (float) Math.cos(a);
        }
        if (op.equalsIgnoreCase("sin")) {
             result = (float) Math.sin(a);
        }
        if (op.equalsIgnoreCase("log")){
             result = (float) Math.log10(a);
        }
        if (op.equalsIgnoreCase("exp")){
            result = (float) Math.pow(a,b);
        }
        if (op.equalsIgnoreCase("raiz")){
            result = (float) Math.sqrt(a);
        }
         if (op.equalsIgnoreCase("pi")){
            result = (float) Math.PI;
        }
         
    }

    @Override
    public String getResultString() {
        String resultString = Double.toString(result);
        return resultString;
    }

}
