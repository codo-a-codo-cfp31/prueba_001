/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoras;

import java.util.ArrayList;
import java.util.List;

//ME FALTA AGREGAR CALCULADORA CIENTIFICA EN LA FABRICA
/**
 *
 * @author CFP31-10
 */
public class CalculadoraFactory {
    //las factorys no tienen atributos y son static si solo quiero una.
    public static ICalculadora crearCalculadora(String tipo){
        
        ICalculadora calculadora = null;
        
        if (tipo.equalsIgnoreCase("simple")){
            calculadora = (ICalculadora) new CalculadoraSimple();
        }
        
        if (tipo.equalsIgnoreCase("cientifica")){
            calculadora = (ICalculadora) new CalculadoraCientifica();
        }
        return calculadora;   
    }
    
    public static List<String> getListaCalculadoras(){
        List<String> ListCalculadora= new ArrayList();
        
        ListCalculadora.add("simple");
        ListCalculadora.add("cientifica");
  

    
        return ListCalculadora;       
    }
}

