//<editor-fold defaultstate="collapsed" desc="Legal">
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//</editor-fold>
/* Coded by Federico Belchior */
/* FedericoBelchior@gmail.com */

package calculadora;

public class CalculadoraCientifica extends CalculadoraSimple{

    public CalculadoraCientifica() {
        resultado = 0;
    }
    
    @Override
    public void UnaryOperation(float elemento1, String operacion){
        if(operator.equals("x²")){
            resultado = Pow2();
        }
        
        if(operator.equals("√")){
            resultado = Sqrt();
        }
        
        if(operator.equals("10ˣ")){
            resultado = PowX();
        }
        
        if(operator.equals("sin")){
            resultado = Sin();
        }
        if(operator.equals("cos")){
            resultado = Cos();
        }
        if(operator.equals("tan")){
            resultado = Tan();
        }
        if(operator.equals("sin-1")){
            resultado = SinInv();
        }
        if(operator.equals("cos-1")){
            resultado = CosInv();
        }
        if(operator.equals("tan-1")){
            resultado = TanInv();
        }
    }
    
    private float Pow2(){
        return (float)Math.pow(element1, 2);
    }
    private float Sqrt(){
        return (float)Math.sqrt(element1);
    }
    private float PowX(){
        return (float)Math.pow(10, element1);
    }
    private float XPowY(){
        return (float)Math.pow(element1, element2);
    }
    private float Sin(){
        return (float)Math.sin(element1);
    }
    private float Cos(){
        return (float)Math.cos(element1);
    }
    private float Tan(){
        return (float)Math.tan(element1);
    }
    private float SinInv(){
        return (float)Math.asin(element1);
    }
    private float CosInv(){
        return (float)Math.acos(element1);
    }
    private float TanInv(){
        return (float)Math.atan(element1);
    }
    
}
