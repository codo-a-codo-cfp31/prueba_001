/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author CFP31-15
 */
public class CountNumberPairsOfANumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero_para_contar ;
        
        Scanner un_scanner = new Scanner(System.in);
          System.out.println("Digite hasta que numero son sus numeros pares:"); // Es el Escribir o Imprimir del PSINT
        numero_para_contar = un_scanner.nextInt();
        System.out.println("Los Numero pares son:"); // Es el Escribir o Imprimir del PSINT
        while ( contador < numero_para_contar) {
             contador = contador +2;
             System.out.println(contador); // Es el Escribir o Imprimir del PSINT
                }
            }
        }