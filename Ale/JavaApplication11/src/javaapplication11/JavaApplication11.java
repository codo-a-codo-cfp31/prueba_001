/*
 */
package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        
        int opcionElegida;
        boolean habilitado = false;
        String[] nombres = new String[15];
        int[] documento = new int[15];
        
        do {
            opcionElegida = mostrarMenu(habilitado);
            
            if (opcionElegida == 1){
                cargarDatos(nombres, documento);
            }
            
            
        } while (opcionElegida != 0);
        
    }
    
    //Muestra el menú al usuario
    public static int mostrarMenu(boolean habilitado){


        final String SEPARADOR_PPAL = "========================================================================";
        final String SEPARADOR_SECUN = "------------------------------------------------------------------------";
        final String ESPACIOS = "                              ";
        final String HEADER1 = "BIENVENIDO ";
        final String HEADER2   = "PROGRAMA EJERCICIO 11 ";
            
        int opcion;
        Scanner teclado = new Scanner (System.in);
        
        do {
            //Limpio pantalla
            System.out.print("\n\n\n\n\n\n");
            System.out.flush();

            //Armo el Header
            System.out.println(SEPARADOR_PPAL);
            System.out.println(ESPACIOS + HEADER1 + "\n                         " + HEADER2);
            System.out.println(SEPARADOR_PPAL);
            System.out.println(ESPACIOS + "Elija la opción");
            System.out.println(SEPARADOR_SECUN);

            //Armo las opciones de Menú dependiendo si esta habilitado o deshabilitado. 
            //Para estar habilitado debió haber cargado datos con anterioridad.
            if (habilitado){
                System.out.println(SEPARADOR_SECUN);
                System.out.println("|  1- Ingreso de datos             |  4- Ver datos de forma inversa    |");
                System.out.println("|  2- Ver datos ingresados         |  5- Buscar segundos nombres       |");
                System.out.println("|  3- Mostrar iniciales            |                                   |");
                System.out.println(SEPARADOR_SECUN);
            } else {
                System.out.println(SEPARADOR_SECUN);
                System.out.println("|  1- Ingreso de datos             |  x- Ver datos de forma inversa    |");
                System.out.println("|  x- Ver datos ingresados         |  x- Buscar segundos nombres       |");
                System.out.println("|  x- Mostrar iniciales            |                                   |");
                System.out.println(SEPARADOR_SECUN);
                System.out.println("|             DEBE INGRESAR DATOS PARA UTILIZAR EL APLICATIVO          |");
                System.out.println(SEPARADOR_SECUN);
            
            }
            
            System.out.println(    "|                         Presione 0 para salir                        |");
            System.out.println(SEPARADOR_SECUN);
            
            System.out.print(" Opción : ");
            opcion = teclado.nextInt();
            
        } while (opcion != 1 && opcion != 2 
                && opcion != 3 && opcion != 4 
                && opcion != 5 && opcion != 6
                && opcion != 0);
        
        return opcion;
    }

    public static void cargarDatos (String[] nombres, int[] documento){
        
        String aux;
        do {
            
            
            
        } while (!aux.equals("0"));
    }
}


