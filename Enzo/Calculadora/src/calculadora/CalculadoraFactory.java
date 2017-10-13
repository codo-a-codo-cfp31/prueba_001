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
public class CalculadoraFactory {

    public static ICalculadora createCalculadora(String tipo) {
  ICalculadora calculadora = null;
        if (tipo.equalsIgnoreCase("simple")) {
            calculadora = new CalculadoraSimple();
        } else if (tipo.equalsIgnoreCase("cientifica")) {
            calculadora = new CalculadoraCientifica();
        }
         // EVITAR EL CASTEO
        //CalculadoraSimple nuevaVariable = (CalculadoraSimple) calculadora;
        return calculadora;
    }

    public static List<String> getListCalcuadora() {
        List<String> lista = new ArrayList<>();
        lista.add("simple");
        lista.add("cientifica");
        return lista;
    }
}