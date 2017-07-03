/*
 * @Program: Hacer un algoritmo que permita cargar un vector con 
 * cinco números enteros y determinar lo siguiente: 
 * ¿Cual es el número mayor? 
 * ¿Cual es el número menor?
 * ¿Cuántos y cuáles números coincidentes hay en el vector?
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vec = new int[15];
        int numsRepe[] = new int[15];
        int cantRep = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese número " + i + ": ");
            vec[i] = teclado.nextInt();
        }

        int max = vec[0];
        int min = vec[0];

        for (int i = 0; i < 15; i++) {
            numsRepe[i] = -1;
        }

        for (int i = 1; i < 15; i++) {
            if (vec[i] > max) {
                max = vec[i];
            }
            if (vec[i] < min) {
                min = vec[i];
            }

            for (int b = 0; b < 15; b++) {
                if (vec[i] == vec[b]) {
                    numsRepe[i] = numsRepe[i] + 1;
                }
            }
        }
        boolean temp;

        System.out.println("El número mayor ingresado es el: " + max + "\nEl menor es: " + min);
        for (int i = 0; i < 15; i++) {
            if (numsRepe[i] > 0) {
                temp = false;
                
                for (int b = 14; b > i; b--) {
                    if (vec[b] == vec[i]) {
                        temp = true;
                    }
                }
                
                if (temp == false) {
                    System.out.print("\nSe repite el número: " + vec[i] + " " + numsRepe[i] + " veces");
                }
            }
        }
    }
}
