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
    protected float a;
    protected String op;
    
    CalculadoraCientifica(){
        a = 0.0f;
        op = "";
        result = 0;
}

    @Override
    public void UnaryOperation(float elemento1, String Operador) {
        a=elemento1;
        op=Operador;
        if(op.equals("tan")){
            Double valor = Math.tan(a);
             result = valor.floatValue();
        }
        
        if(op.equals("tan-1")){
            Double valor = Math.atan(a);
             result = valor.floatValue();
        }
        
        if(op.equals("cos")){
            Double valor = Math.cos(a);
             result = valor.floatValue();
        }
        
         if(op.equals("cos-1")){
            Double valor = Math.acos(a);
             result = valor.floatValue();
        }
        if(op.equals("sin-1")){
            Double valor = Math.asin(a);
             result = valor.floatValue();
        }
        
        if(op.equals("log")){
            Double valor = Math.log10(a);
             result = valor.floatValue();
        }
          
        if(op.equals("10^x")){
            Double valor = Math.pow(10,a);
             result = valor.floatValue();
        }
        
         if(op.equals("ln")){
            Double valor = Math.log(a);
             result = valor.floatValue();
        }
        
        if(op.equals("e^x")){
            Double valor = Math.pow(Math.E,a);
             result = valor.floatValue();
        }
        
        if(Operador.equals("√")){
            Double valor = Math.sqrt(a);
             result = valor.floatValue();
        }
        
         if(Operador.equals("x²")){
            Double valor = Math.pow(a, 2);
             result = valor.floatValue();
        }
        
        if(Operador.equalsIgnoreCase("⅟x")){
             Double valor=1/(double)a;
             result =valor.floatValue();
        }
        
         if(Operador.equalsIgnoreCase("x!")){
              Double valor=(double)(a-1)*a;
             result = valor.floatValue();
    }
      
         if(Operador.equalsIgnoreCase("π")){
              Double valor=a*Math.PI;
             result = valor.floatValue();
    }
         
          if(Operador.equalsIgnoreCase("e")){
               Double valor=a*Math.E;
             result = valor.floatValue();
    }   
          
          if(Operador.equalsIgnoreCase("%")){
               Double valor=(double)a/100;
             result = valor.floatValue();
    }   
          
          if(Operador.equalsIgnoreCase("Ans")){
               Double valor=(double)a;
             result = valor.floatValue();
    }   
}
}