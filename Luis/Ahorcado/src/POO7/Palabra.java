/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;

import java.util.*;
import java.util.List;

/**
 *
 * @author Luis Vera
 */
public class Palabra {

    protected String PalabraAleatoria;
    protected List<String> lista_de_palabras;
    protected double NumAleatorio;
    protected Character letras_de_palabra;
    protected int longitud_de_palabra;
    protected String palabra_oculta;
    protected int longitud_palabra_oculta;

    public Palabra() {
        //implementar clases, properties y responsabilidades
        ListaDePalabras();
        PalabraRandom();
        mostrarPalabraOculta();//Este inicializa la variable "laPalabraAleatoria" porque dentro de este metodo se le dio valor a esta variable

    }

    final public void ListaDePalabras() {

        lista_de_palabras = new ArrayList<>();
        lista_de_palabras.add(0, "Composicion");
        lista_de_palabras.add(1, "Alergico");
        lista_de_palabras.add(2, "Ministro");
        lista_de_palabras.add(3, "Combinacion");
        lista_de_palabras.add(4, "Estacionamiento");
        lista_de_palabras.add(5, "Software");
        lista_de_palabras.add(6, "Adhesion");
        lista_de_palabras.add(7, "Estrategia");
        lista_de_palabras.add(8, "Guachafa");
        lista_de_palabras.add(9, "Cancionero");

    }

    //public int LongitudDePalabra(){
    //longitud_de_palabra = PalabraAleatoria.length();
    //return longitud_de_palabra;
    //}
    final public void PalabraRandom() {

        NumAleatorio = (int) (Math.random() * 10);
        PalabraAleatoria = (lista_de_palabras.get((int) NumAleatorio));

        for (int i = 0; i < PalabraAleatoria.length(); i++) {
            letras_de_palabra = PalabraAleatoria.charAt(i);
            System.out.println(letras_de_palabra);
        }
    }

    final public void mostrarPalabraOculta() {

        palabra_oculta = "";
        for (int i = 0; i < PalabraAleatoria.length(); i++) {
            palabra_oculta = palabra_oculta + "-";
        }
        System.out.println(palabra_oculta);
    }

    public void compararCaracter(String datoIngresado) { //de esta manera este metodo puede ser llamado desde afuera. Se define la variable "datoIngresado" como cualquier nombre y definir el comportamiento del metodo.
        for (int i = 0; i < PalabraAleatoria.length(); i++) {
            if (datoIngresado.equalsIgnoreCase(PalabraAleatoria.substring(i, i))) {
                palabra_oculta = palabra_oculta + datoIngresado;
            } else {
                palabra_oculta = palabra_oculta + "-";
            }
        }
    }

    public String getPalabraAleatoria() {
        return PalabraAleatoria;
    }
}
