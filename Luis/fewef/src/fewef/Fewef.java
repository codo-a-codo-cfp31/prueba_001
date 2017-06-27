/*
realizar un programa q permita cargar un vector con 10 num enteros y determinar lo siguiente, A cuantos son mayores  a 50, B cuantos son menores a 70
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fewef;

import java.util.Scanner;

/**
 *
 * @author CFP31-04
 */
public class Fewef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cinc = 0;
        int set = 0;
        int num[] = new int[10];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese numero");
            num[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (num[i] > 50) {
                cinc++;
            }
            if (num[i] < 70) {
                set++;
            }
        }
        System.out.println("Los mayores a 50 son " + cinc + " y los menores a 70 son " + set + ".");

        // TODO code application logic here
    }

}
