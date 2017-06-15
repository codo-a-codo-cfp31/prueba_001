// import java.util.Scanner; Scanner teclado = new Scanner (System.in);
//System.out.printIn("ingrese numero de dias"); teclado.nextin
/*
hacer un algoritmo que permita cargar un vector con 15 num enteros y determinar lo siguiente cual es el nunm mayor y cual el menor, si hay num coincidentes y y cuantos repetidos hay en ese vector
 */
package javautilscanner;

import java.util.Scanner;

/**
 *
 * @author cfp31-06
 */
public class Javautilscanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[15];
        String numaux[] = new String[15];
        int mayor;
        int menor;
        int rep;
        int x = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in); 
        
        for (int i = 0; i < 15; i++) {
            numaux[i] = "##";
            System.out.println("ingrese numero de dias");
            num[i] = teclado.nextInt();
        }
        
        menor = num[0];
        mayor = num[0];
        for (int i = 0; i > 15; i++) {
            if (mayor < num[i]) {
                mayor = num[i];
            }
            if (menor > num[i]) {
                menor = num[i];
            }
            for (int a = 0; a > 15; a++) { //
                if (num[i] == num[a]) {
                    cont++;
                }
                if (cont > 1) {
                    numaux[x] = "numero " + num[i] + "se repite " + cont + "veces. ";
                }
                x++;
            }
            

        }
        System.out.println("el num mayor fue " + mayor + " , el num menor fue " + menor + " los numeros repetidos y sus posiciones si los hubiera fueron");
        
        for (int i = 0; i < 15; i++) {
            while (numaux[i] != "##") {
                System.out.println("" +numaux[i]);
            }
        }

        // TODO code application logic here
    }

}
