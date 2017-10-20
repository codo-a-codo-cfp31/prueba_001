/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoras;

/**
 *
 * @author CFP31-10
 */
public class CalculadoraCientifica extends CalculadoraSimple {
    
    protected String resultString;
    
    CalculadoraCientifica(){
    result=0;
    resultString="";
}

    @Override
    public void UnaryOperation(float elemento1, String Operador) {
        
        if(Operador.equals("tan")){
            Double valor = Math.tan(elemento1);
             result = valor.floatValue();
        }
        
        if(Operador.equals("cos")){
            Double valor = Math.cos(elemento1);
             result = valor.floatValue();
        }
        
        if(Operador.equals("sin")){
            Double valor = Math.sin(elemento1);
             result = valor.floatValue();
        }
        
        if(Operador.equals("log")){
            Double valor = Math.log10(elemento1);
             result = valor.floatValue();
        }
                
        if(Operador.equals("Mod")){
             result = Math.abs(elemento1);
        }
        
        if(Operador.equals("√")){
            Double valor = Math.sqrt(elemento1);
             result = valor.floatValue();
        }
        
        if(Operador.equals("10˟")){
            Double valor = Math.pow(10,elemento1);
             result = valor.floatValue();
        }
        
        if(Operador.equals("X²")){
            Double valor = Math.pow(elemento1, 2);
             result = valor.floatValue();
        }
    }       
}
