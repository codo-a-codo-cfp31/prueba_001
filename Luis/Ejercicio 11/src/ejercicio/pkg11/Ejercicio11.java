/**
 * @Program:
 * Crear un algoritmo que permita recorrer un vector de notas de veinte posiciones y que determine:
 * a) Nota más alta y nota más baja del curso.
 * b) Promedio de notas del curso.
 * c) Cantidad de notas superior al promedio.
 * d) Cantidad de alumnos aprobados y cantidad de alumnos reprobados (se aprueba con 6).
 * e) Mostrar en pantalla cuando haya dos o más notas iguales o consecutivas.
 * f) Los nombres de los alumnos vienen todos juntos en un string separados por un ";". Guardarlos 
 * en un vector en su orden correspondiente, indicar que alumnos tienen la mayor nota.
 * */

package ejercicio.pkg11;

import java.util.Scanner;

/**
 * @author Nacho kpo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = new int[20];
        int mayor = -1;
        int menor = -1;
        int mayorpro = 0;
        int menorpro = 0;
        int cantidad = 0;
        int aprobados = 0;
        int reprobados = 0;
        int promedio = 0;
        int total = 0;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese la " + (i + 1) + "° nota: ");
            notas[i] = teclado.nextInt();
            cantidad++;
            total = total + notas[i];
        }

        promedio = total / cantidad;

        for (int i = 0; i < 20; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            
            if (notas[i] < menor) {
                menor = notas[i];
            }    
            
            if (notas[i] < menorpro) {
                menorpro = notas[i];
            }
            
            if (notas[i] > mayorpro) {
                mayorpro = notas[i];
            }
 
            if (notas[i] > mayorpro) {
                mayorpro = notas[i];
            }    

            if (notas[i] > 5) {
                aprobados ++;
            }
            
            if (notas[i] < 6) {
                reprobados ++;
            }

        }

    }
}

