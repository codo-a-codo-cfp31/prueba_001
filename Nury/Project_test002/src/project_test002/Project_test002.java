/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_test002;
import java.util.*;

/**
 *
 * @author CFP31-08
 */
public class Project_test002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        
        Scanner otro_scanner = new Scanner(System.in);
        
        contador=otro_scanner.nextInt();
        
        while (contador>0){
            contador=contador-1;
        System.out.println(contador);
        }
    }
}
