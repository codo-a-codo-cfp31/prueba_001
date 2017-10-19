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
    protected float element1 = 0;
    protected float element2 = 0;
    protected String operator;
    
    public CalculadoraSimple() {
       resultado = 0.0f;
    }

    @Override
    public void binaryOperation(float elemento1, String operacion, float elemento2) {
        resultado = 0.0f;
        
        if (operator.equals("+")) {
            resultado = Suma();
        }
        if (operator.equals("-")) {
            resultado = Resta();
        }
        if (operator.equals("X")) {
            resultado = Multiplicacion();
        }
        if (operator.equals("/")) {
            resultado = Division();
        }
    }

    @Override
    public float getResult() {
        System.out.println("resultado: " + resultado);
        return resultado;
   }

    @Override
    public void setElement1(float elemento1) {
        element1 = elemento1;
    }

    @Override
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void setElement2(float elemento2) {
        element2 = elemento2;
    }

    @Override
    public float getElement1() {
       return element1; 
    }

    @Override
    public float getElement2() {
      return element2;  
    }

    @Override
    public String getOperator() {
        return operator;
    }
    
     //Operaciones
    private float Suma(){
        return element1 + element2;
    }
    
    private float Resta(){
        return element1 - element2;
    }
    
    private float Multiplicacion(){
        return element1 * element2;
    }
    
    private float Division(){
        return element1 / element2;
    }

    @Override
    public void UnaryOperation(float elemento1, String operacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
