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
public class CalculadoraSimple implements ICalculadora{
    
    protected float a;
    protected float b;
    protected String op;
    protected float result;

    public CalculadoraSimple() {
        a = 0.0f;
        b = 0.0f;
        op = "";
        result=0.0f;
    }

    @Override
    public void BinaryOperation(float elemento1, String operador, float elemento2){
        a=elemento1;
        b=elemento2;
        op=operador;
        
        if (op.equalsIgnoreCase("+")){
            result=a+b;
        }else if (op.equalsIgnoreCase("-")){
            result=a-b;
        }else if (op.equalsIgnoreCase("*")){
            result=a*b;
        }else if (op.equalsIgnoreCase("/")){
            result=a/b;
        }
    }

    @Override
    public float Result() {
        return result;
        
    }

         
}
