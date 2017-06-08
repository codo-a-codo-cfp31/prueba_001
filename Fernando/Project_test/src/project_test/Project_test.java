package project_test;

import java.util.*;

public class Project_test {


    public static void main(String[] args) {
            int contador = 0;
            int num_contar;
            
            Scanner un_scanner = new Scanner(System.in);
            num_contar = un_scanner.nextInt();
        
            while (contador < num_contar){
             contador = contador + 1;
             System.out.println(contador+",");
            }
    }
    
}
