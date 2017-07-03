/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalabrasofrases;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonatan
 */
public class Buscapalabrasofrases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoingresado;
        boolean coin;
        int longtexto;
        int longbusca;
        int contt = 0;
        int tope;
        int d;
        int h;
        int contc;
        int b;
        int a;
        int x;
        int subcont;
        int num;
        String buscaingresado;
        char res[] = new char[3000];
        coin = false; // comienza
        textoingresado = JOptionPane.showInputDialog("Ingrese texto.");
        char[] texto = textoingresado.toCharArray();// convierte string a chars,carga vector texto con chars de textoingresdo?
        buscaingresado = JOptionPane.showInputDialog("Ingrese texto a buscar.");
        char[] busca = buscaingresado.toCharArray(); // convierte string a chars,carga vector busca con chars de buscaingresado?
        longtexto = textoingresado.length();//longitud de texto
        longbusca = buscaingresado.length();//longitud de busqueda
        tope = longtexto - longbusca - 1;//posicion limite de coincidendia
        if (longtexto >= longbusca) {//es posible que este lo buscado?
            for (a = 0; a <= tope; a++) {//si sí es posible...
                d = 0;
                h = 0;
                contc = 0;
                b = a + longbusca;
                for (int c = a; c < b; c++) {//comparo
                    if (texto[c] == busca[d]) {
                        contc++;
                    } else {
                        c = c + b;
                    }
                    d++;
                }
                if (contc == longbusca) { //si coindide todo
                    coin = true;
                    res[contt] = '[';
                    contt++;
                    for (int i = a; i < b; i++) { //escribo entre [] en el vector
                        res[contt] = texto[a + h];
                        h++;
                        contt++;
                    }
                    res[contt] = ']';
                    contt++;
                    a = a + longbusca - 1;
                    subcont = contt;
                    for (int i = a + 1; i <= longtexto; i++) {//relleno el resto
                        res[subcont] = texto[i];
                        subcont++;

                    }
                } else {// si no coincide todo
                    res[contt] = texto[a];
                    contt++;
                    subcont = contt;
                    for (int i = a + 1; i <= longtexto; i++) {
                        res[subcont] = texto[i];
                        subcont = 1 + subcont;
                    }
                }
            }
        }
        if (longtexto == 0 && longbusca == 0) {
            JOptionPane.showMessageDialog(null, "No se ingresaron datos validos.", "Respuesta", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (longtexto == 0) {
                JOptionPane.showMessageDialog(null, "No se ingreso texto valido.", "Respuesta", JOptionPane.PLAIN_MESSAGE);

            } else {
                if (longbusca == 0) {
                    JOptionPane.showMessageDialog(null, "No se ingreso texto a buscar valido.", "Respuesta", JOptionPane.PLAIN_MESSAGE);

                } else {
                    if (coin = false) {
                        JOptionPane.showMessageDialog(null, "No se encontraron coincidencias.", "Respuesta", JOptionPane.PLAIN_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Se encontraron coincidencias, a continuacion se mostrara el texto con las concidencias marcadas entre [].", "Respuesta", JOptionPane.PLAIN_MESSAGE);

                        textoingresado = new String(texto);
                        JOptionPane.showMessageDialog(null, textoingresado, "Respuesta", JOptionPane.PLAIN_MESSAGE);
                    }

                }
            }
        }

    }

    // TODO code application logic here
}
