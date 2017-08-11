/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author @AnalistaSistok
 */
public class CountToZero {
/**
 * @param args the command line arguments
*/
   
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        Scanner un_scanner = new Scanner(System.in);
        System.out.println("Digite este numero que decrecera hasta cero!!!:"); // Es el Escribir o Imprimir del PSINT
        contador = un_scanner.nextInt();
        
        while ( contador >0) {
             contador = contador -1;
             System.out.println(contador); // Es el Escribir o Imprimir del PSINT
            }
        }
    }