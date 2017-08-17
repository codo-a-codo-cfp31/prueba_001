/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;
import java.math.*;

/**
 *
 * @author CFP31-10
 */
public class Palabra {

    protected List<String> ListaDePalabras;
    protected Integer Long;
    protected String LetraIngresada;
    protected String PalabraElegida;
    protected List<String> ListaDeLetras;
    protected List<String> PalabraOculta;

    public Palabra() {
        ListaDePalabras = new ArrayList<>();
        ListaDePalabras.add("PALA");
        ListaDePalabras.add("OTORRINOLARINGOLOGO");
        ListaDePalabras.add("VENEZUELA");
        ListaDePalabras.add("SUPERVISORA");
        ListaDePalabras.add("ESPERMOGRAMA");
        ListaDePalabras.add("CORCHETE");
        ListaDePalabras.add("XENOFOBIA");
        ListaDePalabras.add("DESCOMPUESTO");
        ListaDeLetras = new ArrayList();
        PalabraOculta = new ArrayList();
        Long =0;
        LetraIngresada = " ";
        PalabraElegida = " ";
        
    }

    public String getPalabraElegida() {
        int max = ListaDePalabras.size();
        PalabraElegida = ListaDePalabras.get((int) (Math.random() * max));
        return PalabraElegida;
    }

    /*con este metodo eligo una palabra de la lista oara que la persona lo adivine
            en la variable max defino al maximo como el tamaño de la lista
            y en palabra elegida uso el metodo get math random por el maximo de la lista ese recorre
            toda la lista y elige aleatoriamente un valor.*/

    public Integer getLong() {
        Long = PalabraElegida.length();
        return Long;
    }  //con este metodo obtengo la longitud de la palabra.

    public void llenarPalabraOculta() {

        for (int i = 0; i < Long; i++) {
            ListaDeLetras.add(PalabraElegida.substring(i, i + 1));
            if (ListaDeLetras.get(i).equalsIgnoreCase(LetraIngresada)) {
                PalabraOculta.add(i, (ListaDeLetras.get(i)));
            } else {
                PalabraOculta.add(i, "-");
            }
        }
    }
    
    public void compararPalabraOculta() {
        for (int i = 0; i < Long; i++) {
            if (ListaDeLetras.get(i).equalsIgnoreCase(LetraIngresada)) {
                if (PalabraOculta.get(i).equals("-")) {
                    PalabraOculta.add(i, (ListaDeLetras.get(i)));
                } else {
                    PalabraOculta.get(i);
                }
            }
        }
    }
}