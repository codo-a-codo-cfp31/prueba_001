/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoras;

//import java.util.List;

/**
 *
 * @author CFP31-10
 */
public interface ICalculadora {
    
    
    public void BinaryOperation(float elemento1,String Operador, float elemento2);
    public void UnaryOperation(float elemento1,String Operador);
    public String getResultString();
    public float getA();
    public void setA(float a);
    public float getB();
    public void setB(float b);
    public String getOp();
    public void setOp(String op);

   // public List<String>getUnitList();

}
