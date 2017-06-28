/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.inversa;

import java.util.Scanner;

/**
 *
 * @author CFP31-14
 */
public class Ejercicio9Inversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int TOPE = 5;
        final int TOPE2 = 5;
        int j = (TOPE - 1);
        int h = (TOPE2 - 1);
        int[] grupo22 = new int[TOPE];
        int[] grupo23 = new int[TOPE2];
        int[] inverse22 = new int[TOPE];
        int[] inverse23 = new int[TOPE2];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < TOPE; i++) {
            System.out.print("Ingrese " + (i + 1) + "° número para el 1er grupo: ");
            grupo22[i] = teclado.nextInt();

        }

        for (int i = 0; i < TOPE2; i++) {
            System.out.print("Ingrese " + (i + 1) + "° número para el 2do grupo: ");
            grupo23[i] = teclado.nextInt();
        }

        for (int i = 0; i < TOPE; i++) {
            inverse22[i] = grupo22[j];
            j--;

        }

        for (int i = 0; i < TOPE2; i++) {
            inverse23[i] = grupo23[h];
            h--;

        }

        for (int i = 0; i < TOPE; i++) {
            System.out.println("Grupo 1 Posición " + (i + 1) + ": " + inverse22[i]);
        }

        for (int i = 0; i < TOPE; i++) {
            System.out.println("Grupo 2 Posición " + (i + 1) + ": " + inverse23[i]);
        }

    }

}
