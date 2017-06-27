/*
Ej 6:
permitir la carga de 15 num en 2 vectores, luego realizar la suma de cada una de las posiciones de ambos vectores y almacenarlo en oto vector,
finalmente mostrarle al usuario el contenido del 3 vector de forma amigable
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmmmmm;

import java.util.Scanner;

/**
 *
 * @author CFP31-04
 */
public class Mmmmmm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vec1[] = new int[15];
        int vec2[] = new int[15];
        int vec3[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        
        
        for (int i = 0; i < 15; i++) {
            System.out.println("ingrese numero en la posicion " + (i + 1) + " del vector 1.");
            vec1[i] = teclado.nextInt();
            
            System.out.println("ingrese numero en la posicion " + (i + 1) + " del vector 2.");
            vec2[i] = teclado.nextInt();
            vec3[i] = vec1[i] + vec2[i];
        }
        
        for (int i = 0; i < 15; i++) {
            System.out.println("La suma de los numeros en la posicion " + (i + 1) + " de ambos vectores es: " + vec3[i] + ".");
        }

    }

}

