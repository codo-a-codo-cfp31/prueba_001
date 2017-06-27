/*

Crea dos arrays que tengan tamaño 100 posiciones, en uno de ellos se almacenarán nombres de personas,
en el otro array ira almacenando la longitud de los nombres. Mostrar el nombre más largo y en que posición se ubica del array.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador.de.letras;

import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class ContadorDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String vecstring[] = new String[3];
        int vecint[] = new int[3];
        int vecpos[] = new int[3];
        String nombre = "";
        int pos = 0;
        int contsolo = 0;
        int mayor = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nombre.");
            vecstring[i] = teclado.next();
            vecint[i] = vecstring[i].length();
            vecpos[i] = -1;

            if (vecint[i] >= mayor) {
                mayor = vecint[i];
                vecpos[i] = i + 1;
                pos = i + 1;
                nombre = vecstring[i];
            }
        }

        for (int i = 0; i < 3; i++) {

            if ((mayor == vecint[i]) && (!nombre.equals(vecstring[i]))) {
                cont++;
            }
            if (nombre.equals(vecstring[i])) {
                contsolo++;
            }
        }

        if (cont > 1) {

            System.out.println("Los nombres mas largos fueron: ");

            for (int i = 0; i < 3; i++) {

                if ((mayor == vecint[i]) && (!nombre.equals(vecstring[i]))) {
                    System.out.println(vecstring[i] + ", en la posicion: " + vecpos[i] + ".");
                }
                if (contsolo > 1){
                    
                }
            }

            System.out.println(nombre + ", en la posicion " + pos + ".");

        } else {

            if (contsolo > 1) {

                System.out.println("El nombre mas largo fue " + nombre + ", en las posiciones");
                for (int i = 0; i < 3; i++) {
                    if (nombre.equals(vecstring[i])) {
                        System.out.println(vecpos[i] + ", ");
                    }
                }
            } else {
                System.out.println("El nombre mas largo fue " + nombre + ", en la posicion " + pos + ".");

            }

            // TODO code application logic here
        }

    }
}
